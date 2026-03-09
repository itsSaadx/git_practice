// the class containe abstract methode is called abstract class
// methode does not containe any defination it must be defined as abstract is called abstract methode
// when we inherite the abstract class into anothre class. abstract methode of the class should be defined in the perticular class which inherits the abstract class
//if the class which inherits the abstract class does not containe its abstract methode so it becomes abstract class.
// obj of the abstract class is not created

// abstract class Parent2{
//     public Parent2(){
//         System.out.println("Mai base2 ka constructor hoon");
//     }
//     public void sayHello(){
//         System.out.println("Hello");
//     }
//     abstract public void greet();
//     abstract public void greet2();
// }

// class Child2 extends Parent2{
//     @Override
//     public void greet(){
//         System.out.println("Good morning");
//     }
//     @Override
//     public void greet2(){
//         System.out.println("Good afternoon");
//     }
// }

// abstract class Child3 extends Parent2{
//     public void th(){
//         System.out.println("I am good");
//     }
// }
// public class abstract_class {
//     public static void main(String[] args) {
//         //Parent2 p = new Parent2(); -- error
//         Child2 c = new Child2();
//         //Child3 c3 = new Child3(); -- error
//     }
// }

// abstract class Shapes {
//     abstract void shape();  // (same thing but implementation is different is called abstract methode)
// }

// class Circle extends Shapes {
//     @Override
//     void shape() {
//         System.out.println("CIRCLE");
//     }
// }

// class Square extends Shapes {
//     @Override
//     void shape() {
//         System.out.println("SQUARE");
//     }
// }

// class Diamond extends Shapes {
//     @Override
//     void shape() {
//         System.out.println("DIAMOND");
//     }
// }

// public class abstract_class {
//     public static void main(String[] args) {
//         Shapes shape1 = new Circle();
//         Shapes shape2 = new Square();
//         Shapes shape3 = new Diamond();

//         shape1.shape(); // Outputs: CIRCLE
//         shape2.shape(); // Outputs: SQUARE
//         shape3.shape(); // Outputs: DIAMOND
//     }
// }


// // Abstract class Vehicle
// abstract class Vehicle {
//     // Abstract methods to be implemented by subclasses
//     abstract void start();
//     abstract void stop();
//     abstract double fuelEfficiency(); // Returns fuel efficiency in km/l

//     // Concrete method
//     void displayInfo(String vehicleType) {
//         System.out.println("Vehicle: " + vehicleType);
//     }
// }

// // Subclass Car
// class Car extends Vehicle {
//     @Override
//     void start() {
//         System.out.println("Starting the car...");
//     }

//     @Override
//     void stop() {
//         System.out.println("Stopping the car...");
//     }

//     @Override
//     double fuelEfficiency() {
//         return 15.0; // Hardcoded fuel efficiency for a car
//     }
// }

// // Subclass Bike
// class Bike extends Vehicle {
//     @Override
//     void start() {
//         System.out.println("Starting the bike...");
//     }

//     @Override
//     void stop() {
//         System.out.println("Stopping the bike...");
//     }

//     @Override
//     double fuelEfficiency() {
//         return 40.0; // Hardcoded fuel efficiency for a bike
//     }
// }

// // Subclass Truck
// class Truck extends Vehicle {
//     @Override
//     void start() {
//         System.out.println("Starting the truck...");
//     }

//     @Override
//     void stop() {
//         System.out.println("Stopping the truck...");
//     }

//     @Override
//     double fuelEfficiency() {
//         return 8.0; // Hardcoded fuel efficiency for a truck
//     }
// }

// // Main class
// public class abstract_class {
//     public static void main(String[] args) {
//         // Create objects for each type of vehicle
//         Vehicle car = new Car();
//         Vehicle bike = new Bike();
//         Vehicle truck = new Truck();

//         // Call methods for the Car
//         car.displayInfo("Car");
//         car.start();
//         System.out.println("Fuel Efficiency: " + car.fuelEfficiency() + " km/l");
//         car.stop();
//         System.out.println();

//         // Call methods for the Bike
//         bike.displayInfo("Bike");
//         bike.start();
//         System.out.println("Fuel Efficiency: " + bike.fuelEfficiency() + " km/l");
//         bike.stop();
//         System.out.println();

//         // Call methods for the Truck
//         truck.displayInfo("Truck");
//         truck.start();
//         System.out.println("Fuel Efficiency: " + truck.fuelEfficiency() + " km/l");
//         truck.stop();
//     }
// }
