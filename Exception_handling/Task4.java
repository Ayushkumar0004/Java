// // Custom Exception:
// // Create a custom exception class called InvalidInputException. Write a Java method that takes a string input and throws InvalidInputException if the input is empty or null.
// import java.util.Scanner;

// // Custom exception class
// class InvalidInputException extends Exception {
//     public InvalidInputException(String message) {
//         super(message);
//     }
// }

// public class Task4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String");
//         String ip1 = sc.nextLine();
//         try {
//             if (ip1.isEmpty() || ip1 == null) {
//                 throw new InvalidInputException("Invalid input!");
//             } else {
//                 System.out.println(ip1);
//             }
//         } catch (InvalidInputException e) {
//             System.out.println(e.getMessage());
//         }
//         finally
//         {
//             sc.close();
//         }
//     }
// }

