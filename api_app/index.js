var http = require('http');
const express = require('express');
const bodyParser = require('body-parser');
const cookieParser = require('cookie-parser');
const db = require('./config/database');
const app = express();

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
app.use(cookieParser());

const router = express.Router();

// db.connect();

//TODO: Add pre-router processing here
router.use(function(request, response, next) {
  console.log('Making api call');
  next();
});

const indexRoutes = require('./routes/index');
app.use('/api/v1', indexRoutes);

// var server = http.createServer(function(req, res) {

// res.writeHead(200);

// res.end('Hi everybody!');

// });

// server.listen(process.env.PORT || 5000);

// console.log(`now listening to ${process.env}:${process.env.PORT}`);

module.exports = app;
