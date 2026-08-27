class Person {
  String name;
  int age;
}

Person human = new Person();
Person parent = new Person();

if (parent.age >= 80 && human.age >= 50){
  parent.destroy();
}