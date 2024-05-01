// // mplement a Java program that searches for a specific keyword in a text file. Handle file input/output operations and search errors using exception handling.
// import java.util.*;
// import java.io.*;
// public class Task7 {
//     public static void main(String[] args) 
//     {
//         boolean found = false;
//         try{
//         // FileWriter f1 = new FileWriter("dest.txt");
//         // f1.write("This is Ayush");
//         FileReader r = new FileReader("dest.txt");
//         BufferedReader br = new BufferedReader(r);
//         String line;
//         while((line = br.readLine()) != null)
//         {
//             if(line.contains("Ayush"))
//             {
//                 found = true;
//                 break;
//             }
//         }
//         br.close();
//         r.close();
//         if (found) {
//             System.out.println("Keyword found in the file.");
//         } else {
//             System.out.println("Keyword not found in the file.");
//         }
//         System.out.println("Successfully search");
//     }
//     catch(Exception e)
//     {
//         System.out.println("Invalid");
//     }

//     }   
// }
