// // Create a custom exception called InvalidAgeException. Write a program that takes age as input and throws this exception if the age is negative.

// import java.util.Scanner;

// public class Task2 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the age: ");
//         int age = sc.nextInt();
//         try{
//             if(age < 0)
//             {
//                 System.out.println(age + " is negative.");
//             }
//             else
//             {
//                 System.out.println(age + " is positive.");
//             }
//         }
//         catch(Exception e)
//         {
//             System.out.println("The age is negative");
//         }
//         finally
//         {
//             sc.close();
//         }
//     }
// }
