public class Person {
    String name;
    int age;

    // Default constructor
    public Person() {
        this.name = "";
        this.age = 0;
    }

    // Constructor with name parameter
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with name and age parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
