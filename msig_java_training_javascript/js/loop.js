var dayOfWeek = ["日", "一", "二"];

for (var i= 0; i < dayOfWeek.length; i++) {
  console.log(dayOfWeek[i]);
}

for (var y in dayOfWeek) {
  console.log(dayOfWeek[y]);
}

var x = 0;
while (x < dayOfWeek.length) {
  console.log(dayOfWeek[x]);
  x++;
}