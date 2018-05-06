const express = require('express');
const router = express.Router();
const db = require('../config/database');
const User = require('../models/users');

router.get('/user', function(req, res) {
  // console.log('User:');
  // console.log(User);
  // User.find().
  db.client.query('SELECT * FROM Users;').then(users => {
    console.log(users);
    res.status(200).json({
      status: 'success',
      focus: 'users',
      data: users
    });
  });
});

module.exports = router;
