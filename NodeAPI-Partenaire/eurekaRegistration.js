const {Eureka} = require("eureka-js-client");
const eurekaHost = process.env.EUREKA_CLIENT_SERVICEURL_DEFAULTZONE || 'localhost';
const eurekaPort = 8761;
const hostName = 'localhost';
const ipAddr = '127.0.0.1'; // Adjust based on your environment

exports.registerWithEureka = function(appName, PORT) {
    const client = new Eureka({
        instance: {
            app: appName,
            hostName: hostName,
            ipAddr: ipAddr,
            port: {
                '$': PORT,
                '@enabled': 'true',
            },
            vipAddress: appName,
            dataCenterInfo: {
                '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
                name: 'MyOwn',
            },
        },
        eureka: {
            host: eurekaHost,
            port: eurekaPort,
            servicePath: '/eureka/apps/',
            maxRetries: 10,
            requestRetryDelay: 2000,
        },
    });

    client.logger.level('debug');

    client.start(error => {
        if (error) {
            console.error('Error registering with Eureka:', error);
        } else {
            console.log(`${appName} service registered with Eureka`);
        }
    });

    process.on('SIGINT', () => {
        console.log('SIGINT received. Deregistering from Eureka and exiting...');
        client.stop(() => {
            process.exit();
        });
    });

    client.on('deregistered', () => {
        console.log('Successfully deregistered from Eureka.');
        process.exit();
    });

    client.on('started', () => {
        console.log(`Eureka host: ${eurekaHost}`);
    });
};

