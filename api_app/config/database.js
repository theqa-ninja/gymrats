const pg = require('pg');

const connectionString = process.env.DATABASE_URL;

const client = new pg.Client(connectionString);

module.exports = { client };
