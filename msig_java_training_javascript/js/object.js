var student = {
  firstName: "Matt",
  lastName: "Ho",
  name: function() {
    return this.firstName + " " + this.lastName;
  }
};

console.log(typeof student);
console.log(student.firstName + " " + student.lastName);
console.log(student.name());

student.firstName = "John";
student["lastName"] = "Chen";
console.log(student.name());
