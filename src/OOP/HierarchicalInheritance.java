class Vehicle {
   void run() {
      System.out.println("Vehicle is running");
   }
}

class Car extends Vehicle {
   void accelerate() {
      System.out.println("Car is accelerating");
   }
}

class Bike extends Vehicle {
   void ride() {
      System.out.println("Bike is riding");
   }
}

class Test {
   public static void main(String args[]) {
      Car car = new Car();
      car.run(); // Output: Vehicle is running
      car.accelerate(); // Output: Car is accelerating
      
      Bike bike = new Bike();
      bike.run(); // Output: Vehicle is running
      bike.ride(); // Output: Bike is riding
   }
}
