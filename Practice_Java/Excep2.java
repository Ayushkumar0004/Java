// Usage of throw and throws:
// Write a method validateAge(int age) that accepts an age as input and throws an IllegalArgumentException if the age is negative.
import java.util.*;
public class Excep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        try {
            validateAge(age);
            System.out.println("Valid age: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid age: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
    public static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
