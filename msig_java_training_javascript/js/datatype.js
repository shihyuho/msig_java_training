// typeof

var x;
console.log(typeof x);

x = "apple";
console.log(typeof x);

x = 1;
console.log(typeof x);

x = true;
console.log(typeof x);

x = 
[{
  name: "apple",
  type: "iphone6s"
}, {
  name: "apple",
  type: "iphone6s+"
}];
console.log(typeof x);

x = function() {
};
console.log(typeof x);

x = null;
console.log(typeof x);

x = undefined;
console.log(typeof x);

// console.log( x() );

console.log(null == undefined);
console.log(null === undefined);
console.log(0 == false);

var y = "Matt" + 10 + 5;
console.log(y);
y = 10 + 5 + "Matt";
console.log(y);
