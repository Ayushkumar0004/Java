import java.util.Scanner;

@FunctionalInterface
interface TotalSalary {
    double totalSal(Employee[] emp);
}

class Employee {
    String name, department;
    int salary;
    int hoursWorked;

    public Employee(String nm, String dept, int slry, int hw) {
        this.name = nm;
        this.department = dept;
        this.salary = slry;
        this.hoursWorked = hw;
    }

    String getName() {
        return name;
    }

    String getDepartment() {
        return department;
    }

    int getSalary() {
        return salary;
    }

    int getHoursWorked() {
        return hoursWorked;
    }
}

public class Prac14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numEmp = sc.nextInt();
        sc.nextLine(); // consume newline
        Employee[] empArr = new Employee[numEmp];
        for (int i = 0; i < numEmp; i++) {
            System.out.println("Enter the details of employee " + (i + 1) + ":");
            System.out.print("Enter the name: ");
            String name = sc.nextLine();
            System.out.print("Enter the department: ");
            String department = sc.nextLine();
            System.out.print("Enter the salary: ");
            int salary = sc.nextInt();
            System.out.print("Enter the hours worked: ");
            int hoursWorked = sc.nextInt();
            sc.nextLine(); // consume newline
            empArr[i] = new Employee(name, department, salary, hoursWorked);
        }

        TotalSalary totalSalaryByDepartment = employees -> {
            double total = 0;
            System.out.print("Enter department to calculate total salary: ");
            String department = sc.nextLine();
            for (Employee emp : employees) {
                if (emp.getDepartment().equalsIgnoreCase(department)) {
                    total += emp.getSalary();
                }
            }
            return total;
        };
        System.out.println("Total salary of employees in a specific department: $" +
                           totalSalaryByDepartment.totalSal(empArr));
                           sc.close();
    }
}