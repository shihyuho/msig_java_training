function hi(hour) {
  if (hour < 9) {
    return "Good morning";
  } else if (hour < 18) {
    return "Good day";
  } else {
    return "Good evening";
  }
}

console.log(hi(new Date().getHours()));

function dayOfWeek(day) {
  switch (day) {
    case 0:
      return "日";
    case 1:
      return "一";
    case 2:
      return "二";
  }
}

console.log(dayOfWeek(new Date().getDay()));