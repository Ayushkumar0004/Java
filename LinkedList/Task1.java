// import java.util.*;
// public class Task1 {
//     public static void main(String[] args) {
//         LinkedList<Integer> o1 = new LinkedList<>();
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of elements in the linked list: ");
//         int n = sc.nextInt();
        
//         System.out.println("Enter the elements: ");
//         for (int i = 0; i < n; i++) {
//             int element = sc.nextInt();
//             o1.add(element);
//         }

//         System.out.println("Original List: " + o1);
//         int middleIndex = n / 2;
//         if (n % 2 == 0) {
//             o1.remove(middleIndex - 1);
//         } 
//         else 
//         {
//             o1.remove(middleIndex);
//         }
//         System.out.println("List after removing middle element: " + o1);
//         sc.close();
//     }
// }