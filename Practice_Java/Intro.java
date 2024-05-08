// // Create a class hierarchy for different types of vehicles (e.g., Car, Bicycle, Truck). Each subclass should inherit from a Vehicle superclass. Implement common attributes and methods in the superclass and specific ones in the subclasses.
// // package Practice_Java;
// class Vehicle
// {
//     void engine()
//     {
//         System.out.println("Show the type of engine");
//     }
//     void Wheeler()
//     {
//         System.out.println("Show the wheeler of truck");
//     }
// }
// class Car extends Vehicle
// {
//     int doors = 4;
//     void engine()
//     {
//         System.out.println("The engine is v4.");
//     }
//     void Wheeler()
//     {
//         System.out.println("Car is 4 wheeler.");
//         System.out.println("Car has " + doors + " doors.");
//     }
// }
// class Bicycle extends Vehicle
// {
//     void Wheeler()
//     {
//         System.out.println("Bicycle is 2 wheeler.");
//     }
// }
// class Truck extends Vehicle
// {
//     int doors = 2;
//     void engine()
//     {
//         System.out.println("Truck is v8 engine.");
//     } 
//     void Wheeler()
//     {
//         System.out.println("Dependent on the varient of truck");
//         System.out.println("Truck has " + doors + " doors");
//     }
// }
// public class Intro {
//     public static void main(String[] args) {
//         Car mycar = new Car();
//         Bicycle mybike = new Bicycle();
//         Truck myTruck = new Truck();
//         mycar.engine();
//         mycar.Wheeler();
//         mybike.Wheeler();
//         myTruck.engine();
//         myTruck.Wheeler();
//     }
// }