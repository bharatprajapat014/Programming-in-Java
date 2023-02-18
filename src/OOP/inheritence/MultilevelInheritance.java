class Animal {
   void eat() {
      System.out.println("Animal is eating");
   }
}

class Dog extends Animal {
   void bark() {
      System.out.println("Dog is barking");
   }
}

class Bulldog extends Dog {
   public static void main(String args[]) {
      Bulldog bulldog = new Bulldog();
      bulldog.eat(); // Output: Animal is eating
      bulldog.bark(); // Output: Dog is barking
   }
}
