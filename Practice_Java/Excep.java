// Write a Java program that reads an integer from the user. Use a try-catch block to handle NumberFormatException if the input is not an integer. In the finally block, print a message indicating the end of the program execution.
import java.util.*;
public class Excep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        try
        {
            Integer.parseInt(num);
            System.out.println(num + " is a valid integer");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid integer");
        }
        finally
        {
            sc.close();
        }
    }
}