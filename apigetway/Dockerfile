FROM openjdk:8
EXPOSE 8089
ADD /target/cloud-gateway-service-0.0.1-SNAPSHOT.jar cloud-gateway-service.jar
ENTRYPOINT ["java" , "-jar" , "cloud-gateway-service.jar"]