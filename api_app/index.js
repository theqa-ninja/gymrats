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

db.client.connect();

//TODO: Add pre-router processing here
router.use(function(request, response, next) {
  console.log('Making api call');
  next();
});

const indexRoutes = require('./routes/index');
app.use('/api/v1', indexRoutes);

module.exports = app;
