function retStr(){
  return "Hello world !!"
}

var val = retStr();
console.log("Val is:"+val);

function sum(a,b){
 var sum = a+b;
 console.log("sum of a,b is :"+sum)
}
sum(3,4);

function default_sum(a,b=1){
  return a+b;	 
}
console.log(default_sum(6));

function rest_function_demo(...param){
  console.log("the no. of params:"+param.length)
}

rest_function_demo(1,2,3,4);

function factorial(num){
  if(num<=0){
   return 1;	
  }
  return num*factorial(num-1);
}

console.log(factorial(6));
console.log(factorial(5));

var lambda = (x)=>x*x;
console.log(lambda(4));
console.log(lambda(5));
