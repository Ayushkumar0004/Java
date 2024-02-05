import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("You entered an integer: " + number);
        } else {
            String input = scanner.next();
            System.out.println("You entered a non-integer value: " + input);
        }
        scanner.close();
    }
}