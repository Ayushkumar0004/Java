// // Design a Java program to model a vehicle rental system. Create a superclass Vehicle with properties like make, model, and rentalRate, and methods like calculateRentalCost(). Then create subclasses like Car, Truck, and Motorcycle inheriting from Vehicle. Each subclass should have additional properties like numSeats for cars, cargoCapacity for trucks, and engineCapacity for motorcycles.
// // package Practice;
// import java.util.Scanner;
// class Vehicle
// {
//     public String make;
//     public String model;
//     public int rentalRate;
//     public int duration;
//     public int getDur()
//     {
//         return duration;
//     }
//     public  void setDur(int d)
//     {
//         this.duration = d;
//     }
//     public int calcRentalCost()
//         {
//             return (rentalRate * duration);
//         }
// }
// class Car extends Vehicle
// {
//     public String getMake()
//     {
//         return make;
//     }
//     public void setMake(String s)
//     {
//         this.make = s;
//     }

//     public String getModel()
//     {
//         return model;
//     }
//     public void setModel(String s1)
//     {
//         this.make = s1;
//     }
    
//     public int getrR()
//     {
//         return rentalRate;
//     }
//     public void setmake(int ren)
//     {
//         this.rentalRate = ren;
//     }
//     public int calcRentalCost()
//     {
//         return  super.calcRentalCost(); // calling the parent class method
//     }
// }

// class Truck extends Vehicle
// {
//     public String getMake()
//     {
//         return make;
//     }
//     public void setMake(String s)
//     {
//         this.make = s;
//     }

//     public String getModel()
//     {
//         return model;
//     }
//     public void setModel(String s1)
//     {
//         this.make = s1;
//     }
    
//     public int getrR()
//     {
//         return rentalRate;
//     }
//     public void setmake(int ren)
//     {
//         this.rentalRate = ren;
//     }
//     public int calcRentalCost()
//     {
//         return  super.calcRentalCost();
//     }
// }

// class Motorcycle extends Vehicle
// {
//     public String getMake()
//     {
//         return make;
//     }
//     public void setMake(String s)
//     {
//         this.make = s;
//     }

//     public String getModel()
//     {
//         return model;
//     }
//     public void setModel(String s1)
//     {
//         this.make = s1;
//     }
    
//     public int getrR()
//     {
//         return rentalRate;
//     }
//     public void setmake(int ren)
//     {
//         this.rentalRate = ren;
//     }
//     public int calcRentalCost()
//     {
//         return  super.calcRentalCost();
//     }
// }
// public class Prac3 {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Choose vehicle type:");
//         System.out.println("1. Car");
//         System.out.println("2. Truck");
//         System.out.println("3. Motorcycle");

//         int choice = sc.nextInt();

//         switch(choice) {
//             case 1:
//                 Car car = new Car();
//                 System.out.println("Enter Car details:");
//                 System.out.println("Enter the make: ");
//                 car.make = sc.next();
//                 System.out.println("Enter the model: ");
//                 car.model = sc.next();
//                 System.out.println("Enter the rental rate: ");
//                 car.rentalRate = sc.nextInt();
//                 System.out.println("Enter the duration: ");
//                 car.duration = sc.nextInt();
//                 System.out.println("Rental cost for Car: $" + car.calcRentalCost());
//                 break;
//             case 2:
//                 Truck truck = new Truck();
//                 System.out.println("Enter Truck details:");
//                 System.out.println("Enter the make: ");
//                 truck.make = sc.next();
//                 System.out.println("Enter the model: ");
//                 truck.model = sc.next();
//                 System.out.println("Enter the rental rate: ");
//                 truck.rentalRate = sc.nextInt();
//                 System.out.println("Enter the duration: ");
//                 truck.duration = sc.nextInt();
//                 System.out.println("Rental cost for Truck: $" + truck.calcRentalCost());
//                 break;
//             case 3:
//                 Motorcycle motorcycle = new Motorcycle();
//                 System.out.println("Enter Motorcycle details:");
//                 System.out.println("Enter the make: ");
//                 motorcycle.make = sc.next();
//                 System.out.println("Enter the model: ");
//                 motorcycle.model = sc.next();
//                 System.out.println("Enter the rental rate: ");
//                 motorcycle.rentalRate = sc.nextInt();
//                 System.out.println("Enter the duration: ");
//                 motorcycle.duration = sc.nextInt();

//                 System.out.println("Rental cost for Motorcycle: $" + motorcycle.calcRentalCost());
//                 break;
//             default:
//                 System.out.println("Invalid choice!");
//         }
//         sc.close();
//     }
// }