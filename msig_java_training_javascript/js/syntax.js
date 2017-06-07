// 註解

console.log("註解用 //");

// Var

var global = "Hello";

function sayHi(name) {
  hi = global + " " + name; 
  return hi;
}

console.log(sayHi("Matt"));
console.log(hi);

function age(birthYear) {
  return new Date().getFullYear() - birthYear;
}

console.log(age(1984));