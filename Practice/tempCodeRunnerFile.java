package Practice;
// class Company {
//     private int salary;

//     public int getSalary() {
//         return salary;
//     }

//     public void setSalary(int s) {
//         this.salary = s;
//     }

//     // Assuming this method is for calculating total salary
//     public int calculateSalary() {
//         return salary;
//     }
// }

// class Manager extends Company {
//     private int bonus;

//     public int getBonus() {
//         return bonus;
//     }

//     public void setBonus(int b) {
//         this.bonus = b;
//     }

//     // Assuming this method is for calculating total salary
//     public double totalSalary() {
//         return getSalary() + bonus;
//     }
// }

// class Worker extends Company {
//     private double hRate;

//     public double getHRate() {
//         return hRate;
//     }

//     public void setHRate(double HR) {
//         this.hRate = HR;
//     }

//     // Assuming this method is for calculating total salary based on hours worked
//     public double calcHoursWorked(int hoursWorked) {
//         return hoursWorked * hRate;
//     }
// }

// public class Prac2 {
//     public static void main(String[] args) {
//         Manager manager = new Manager(); 
//         manager.setSalary(85000);
//         manager.setBonus(14500);
//         System.out.println("The Total Salary for the manager is: " + manager.totalSalary());

//         Worker worker = new Worker();
//         worker.setSalary(85000);
//         worker.setHRate(12);
//         int hoursWorked = 40; // Assuming 40 hours worked for simplicity
//         System.out.println("The Total Salary for the worker is: " + (worker.getSalary() + worker.calcHoursWorked(hoursWorked)));
//     }
// }