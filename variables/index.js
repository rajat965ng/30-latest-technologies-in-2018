"use strict"
function test(){
  var num = 100
  console.log("The value of num in test is "+num);
  {
   console.log("The inner block begin")
   let num = 200
   console.log("The value of num:"+num)
  }
}

test();

var  main = function(){
  for(var x=0;x<5;x++){
    console.log(x);	
  }	
  console.log("x can be accessed outside the block:"+x)
  console.log('x is hoisting variable')
}

main();
