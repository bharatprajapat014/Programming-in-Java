// Define a class called Person
class Person {
    String name;
    int age;
    
    void sayHello() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }
}

// Create an object of the Person class
Person person1 = new Person();
// object is person1
// Set some properties of the object
person1.name = "bharat";
person1.age = 20;

// Call a method of the object
person1.sayHello();
