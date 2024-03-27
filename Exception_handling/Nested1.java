// // package Exception_handling;

// public class Nested1
// {
//     public static void main(String[] args) {
//         try {
//             try {
//                 int[] arr = {1, 2, 3};
//                 System.out.println(arr[5]); 
//             } catch (ArrayIndexOutOfBoundsException e) {
//                 System.out.println("Inner catch block: ArrayIndexOutOfBoundsException caught!");
//                 System.out.println("Inner catch block: " + e.getMessage());
//             }
            
//             try {
//                 int result = divideByZero();
//                 System.out.println("Result: " + result);
//             } catch (ArithmeticException e) {
//                 System.out.println("Another catch block: ArithmeticException caught!");
//                 System.out.println("Another catch block: " + e.getMessage());
//             }
//         } catch (Exception e) {
//             System.out.println("Outer catch block: Exception caught!");
//             System.out.println("Outer catch block: " + e.getMessage());
//         }
//     }
    
//     public static int divideByZero() {
//         return 10 / 0;
//     }
// }