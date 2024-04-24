// // package Exception_Prac;
// // Write a Java program that initializes an array of integers and tries to access an element at an index which is out of bounds. Handle this scenario by catching and handling the ArrayIndexOutOfBoundsException.
// import java.util.*;
// public class Task1 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of n: ");
//         int n = sc.nextInt();
//         int[] arr1 = new int[n];
//         for(int i = 0; i< n; i++)
//         {
//             arr1[i] = sc.nextInt();
//         }
//         for(int i = 0; i < n; i++)
//         {
//             System.out.println("Elements of the array: " + arr1[i]);
//         }
//         try{
//             if(n <= 0)
//             {
//                 throw new ArrayIndexOutOfBoundsException("Array is out of bound!");
//             }
//         }
//         catch (Exception e)
//         {
//             System.out.println("Array is out of bound!");
//         }
//         finally
//         {
//             sc.close();
//         }
//     }
// }
