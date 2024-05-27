class Hierarchy {
    String role;
    void calculateSalary() {
        // Method to calculate salary
    }
}

class Manager extends Hierarchy {
    int salary;

    public Manager(int sal) {
        this.salary = sal;
        this.role = "Manager";
    }

    public int getSal() {
        return salary;
    }

    void calculateSalary() {
        // Example calculation for Manager: Base Salary + Bonus
        int baseSalary = 50000; // Base salary for Manager
        int bonus = 10000; // Bonus based on performance
        salary = baseSalary + bonus;
    }
}

class Employee extends Hierarchy {
    int salary;

    public Employee(int sal) {
        this.salary = sal;
        this.role = "Employee";
    }

    public int getSal() {
        return salary;
    }

    void calculateSalary() {
        // Example calculation for Employee: Base Salary + Overtime pay
        int baseSalary = 30000; // Base salary for Employee
        int overtimeHours = 10; // Number of overtime hours worked
        double overtimePayRate = 20; // Overtime pay rate per hour
        salary = baseSalary + (int) (overtimeHours * overtimePayRate);
    }
}

class Programmer extends Hierarchy {
    int salary;

    public Programmer(int sal) {
        this.salary = sal;
        this.role = "Programmer";
    }

    public int getSal() {
        return salary;
    }

    void calculateSalary() {
        // Example calculation for Programmer: Base Salary + Project-based incentives
        int baseSalary = 60000; // Base salary for Programmer
        int projectIncentives = 15000; // Incentives based on project completion
        salary = baseSalary + projectIncentives;
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Manager m1 = new Manager(45700);
        Employee e1 = new Employee(35000);
        Programmer p1 = new Programmer(50000);

        // Calculate salaries for each employee
        m1.calculateSalary();
        e1.calculateSalary();
        p1.calculateSalary();

        // Display salaries for each employee
        System.out.println("Manager Salary: " + m1.getSal());
        System.out.println("Employee Salary: " + e1.getSal());
        System.out.println("Programmer Salary: " + p1.getSal());
    }
}