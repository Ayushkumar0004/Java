import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        try {
            calculate(a, b, operator);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
    public static void calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                System.out.println("The sum of two numbers is: " + (a + b));
                break;
            case '-':
                System.out.println("The difference of two numbers is: " + (a - b));
                break;
            case '*':
                System.out.println("The product of two numbers is: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                System.out.println("The division of two numbers is: " + ((double) a / b));
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}