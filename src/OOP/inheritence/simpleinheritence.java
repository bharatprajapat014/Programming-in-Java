class Vehicle {
   void run() {
      System.out.println("Vehicle is running");
   }
}

class Car extends Vehicle {
   public static void main(String args[]) {
      Car car = new Car();
      car.run(); // Output: Vehicle is running
   }
}
