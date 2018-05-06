'use strict';
module.exports = (sequelize, DataTypes) => {
  var Users = sequelize.define('Users', {
    name: DataTypes.STRING
  });

  Users.associate = function(models) {
    // associations can be defined here
  };

  Users.sync({ force: true }).then(() => {
    // Table created
    return Users.create({
      name: 'John'
    });
  });

  return Users;
};
