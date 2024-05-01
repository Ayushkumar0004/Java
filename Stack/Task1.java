// // package Stack;
// import java.util.Scanner;
// import java.util.Stack;

// public class Task1 {
//     public static void main(String[] args) {
//         Stack<Integer> o1 = new Stack<>();
//         Scanner sc = new Scanner(System.in);
//         char choice;
//         do 
//         {
//             System.out.println("Enter 'i' to insert, 'd' to delete, or 'q' to quit:");
//             choice = sc.next().charAt(0);
//             switch (choice) {
//                 case 'i':
//                     System.out.println("Enter element to insert:");
//                     int element = sc.nextInt();
//                     o1.push(element);
//                     System.out.println(element + " inserted into the stack.");
//                     break;
//                 case 'd':
//                     if (!o1.isEmpty()) {
//                         int deletedElement = o1.pop();
//                         System.out.println(deletedElement + " deleted from the stack.");
//                     } else {
//                         System.out.println("Stack is empty. Cannot delete.");
//                     }
//                     break;
//                 case 'q':
//                     System.out.println("Exiting program.");
//                     break;

//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//             }

//         } while (choice != 'q');
//         sc.close();
//     }
// }