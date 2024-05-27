// Write a program to iterate through an array of integers and find the sum of all elements.
import java.util.*;
public class Loop1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =  0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0;i < n; i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }   
}