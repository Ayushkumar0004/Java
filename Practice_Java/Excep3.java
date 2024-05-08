// Develop a program that performs arithmetic operations (addition, subtraction, multiplication, division) based on user input. Handle multiple exceptions (such as NumberFormatException and ArithmeticException) using multi-catch blocks.
import java.util.*;
public class Excep3 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter two numbers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            
            System.out.println("Select operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            int select = sc.nextInt();
            
            switch (select) {
                case 1:
                    System.out.println("Addition : " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Difference : " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplication : " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed");
                    } else {
                        System.out.println("Division : " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}