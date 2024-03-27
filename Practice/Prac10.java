// Create a lambda expression to reverse a given string. Use a functional interface with a method reverse(String str) returning the reversed string.
import java.util.Scanner;
interface reverse
{
    String reverseString(String str);
}
public class Prac10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverse r = (str) -> {
        StringBuilder reversed= new StringBuilder(str).reverse();
        return reversed.toString();
        };
        System.out.println("Enter a string");
        String ip = sc.nextLine();
        String rv = r.reverseString(ip);
        System.out.println("Reverse string is : " + rv);
        sc.close();
    }
}