var mysql = require('mysql');

var connect = mysql.createConnection({
  host: 'example.org',
  user: 'bob',
  password: 'secret'
});

module.exports = { connect };
