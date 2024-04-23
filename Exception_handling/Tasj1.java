// Write a Java program that takes two integers as input and performs division. Handle the exception that may occur if the second integer is zero.
import java.util.*;
public class Tasj1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            double a, b, c;
            System.out.println("Enter the value of a: ");
            a = sc.nextDouble();
            System.out.println("Enter the value of b: ");
            b = sc.nextDouble();
            if(b == 0)
            {
                System.out.println("B should be greater than 0");
            }
            else
            {
                c = a / b;
                System.out.println("The division is : " + c);
            }
        }    
        catch(ArithmeticException e)
        {
            System.out.println("B should be greater than 0");
        }
        finally
        {
            sc.close();
        }
    }
}