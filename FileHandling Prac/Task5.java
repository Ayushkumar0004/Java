// // package FileHandling Prac;
// // Write a Java program that reads a text file and counts the occurrences of each word in the file. Handle the file input/output operations using exception handling.
// import java.io.*;
// import java.util.*;
// public class Task5 {
//     public static void main(String[] args) throws IOException{
//         try{
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         FileWriter f = new FileWriter("Word.txt");
//         FileReader f1 = new FileReader("Word.txt");
//         f.write(str);
//         int i;
//         while((i = f1.read()) != -1)
//         {
//             System.out.println((char) i);
//         }
//         System.out.println("Successfully compile");
//         f.close();
//         f1.close();
//         sc.close();
//         }
//         catch(FileNotFoundException e)
//         {
//             System.out.println(e);
//         }
//     }
// }