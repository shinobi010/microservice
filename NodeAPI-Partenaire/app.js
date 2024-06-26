const express = require('express');
const mongoose = require('mongoose');
const url = 'mongodb+srv://ghas:ghas@agence.w0ioqef.mongodb.net/?retryWrites=true&w=majority&appName=Agence';

const app = express();


mongoose.connect(url, { useNewUrlParser: true, useUnifiedTopology: true });
const con = mongoose.connection;

con.on('open', () => {
    console.log('connected...');
});

con.on('error', (err) => {
    console.error('Connection error:', err);
});

app.use(express.json());

const partenaireRouter = require('./routes/partenaires');
app.use('/partenaires', partenaireRouter);

// Root route
app.get('/', (req, res) => {
    res.send('Welcome To our Travel Agency backend server for our Partenships!');
});

app.listen(3000, () => {
    console.log('Server started on port 3000');
}).on('error', (err) => {
    console.error('Failed to start server:', err);
});

const { registerWithEureka } = require('./eurekaRegistration');
const Eureka = require('eureka-js-client').Eureka;
const appName = 'NodeAPI-Partenaire'; // Adjust as necessary
const PORT = 3000; // Adjust to your application's port


registerWithEureka(appName, PORT);
