const express = require('express');
const router = express.Router();

router.get('/', function(req, res) {
  res.status(200).json({ "APP's Purpose": 'home i am' });
  console.log('api call receieved!');
});

router.get('/testing', function(req, res) {
  let fields = {
    email: 'test@testcom '.trim(),
    userName: 'mom',
    displayName: 'dude',
    lala: 'zzz'
  };
  res
    .status(200)
    .json({
      reply: 'Yes: we hear you houston!  Come in!',
      temp: `${JSON.stringify(fields)}`
    });
  console.log(`${JSON.stringify(fields)}`);
  // console.log(`${date} : ${status} : ${message} : ${headers} : ${ip}`);
});

module.exports = router;
