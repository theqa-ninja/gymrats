const express = require('express');
const router = express.Router();
const db = require('../config/database');

router.get('/', function(req, res) {
  res.status(200).json({ "APP's Purpose": 'home i am' });
  console.log('api call receieved!');
});

router.get('/db', function(req, res) {
  db.client
    .query('SELECT table_schema,table_name FROM information_schema.tables;')
    .then(function(data) {
      res.status(200).json({
        status: 'success',
        data: data
      });
    });
});

router.get('/testing', function(req, res) {
  let fields = {
    email: 'test@testcom '.trim(),
    userName: 'mom',
    displayName: 'dude',
    lala: 'zzz'
  };
  res.status(200).json({
    reply: 'Yes: we hear you houston!  Come in!',
    temp: `${JSON.stringify(fields)}`
  });
  console.log(`${JSON.stringify(fields)}`);
});

module.exports = router;
