console.log('starting app !');

const fs  = require('fs');

const os = require('os');

var user =  os.userInfo();


fs.appendFile('greeting.txt',`Good morning...${user.username} !!`,function(err){
  if (err) {
    console.log('unable to write file !!');
  }
});


console.log(user);
