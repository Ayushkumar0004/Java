// // package FileHandling Prac;
// import java.util.*;
// import java.io.*;
// public class Task4 {
//     public static void main(String[] args) throws IOException{
//         try{
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the name of first file: ");
//         String FileName = sc.nextLine();
//         FileReader f = new FileReader(FileName);
//         System.out.println("Enter the name of second file: ");
//         String FileName1 = sc.nextLine();
//         FileWriter f1 = new FileWriter(FileName1);
//             int i;
//             while((i = f.read()) != -1)
//             {
//                 f1.write((char) i);
//             }
//             System.out.println("Data copied successfully!");
//             f1.close();
//             f.close();
//             sc.close();
//         }
//         catch(FileNotFoundException e)
//         {
//             System.out.println(e);
//         }
//     }
// }
// // import java.util.*;
// // import java.io.*;

// // public class Task4 {
// //     public static void main(String[] args) throws IOException {
// //         try {
// //             Scanner sc = new Scanner(System.in);

// //             // Prompt the user for the source and destination file names
// //             System.out.println("Enter the name of the source file: ");
// //             String sourceFileName = sc.nextLine();
// //             System.out.println("Enter the name of the destination file: ");
// //             String destinationFileName = sc.nextLine();

// //             // Create FileReader and FileWriter objects
// //             FileReader fr = new FileReader(sourceFileName);
// //             FileWriter fw = new FileWriter(destinationFileName);

// //             // Copy data from source file to destination file
// //             int character;
// //             while ((character = fr.read()) != -1) {
// //                 fw.write(character);
// //             }

// //             System.out.println("Data copied successfully!");

// //             // Close resources
// //             fr.close();
// //             fw.close();
// //         } catch (FileNotFoundException e) {
// //             System.out.println("File not found: " + e.getMessage());
// //         } catch (IOException e) {
// //             System.out.println("Error reading/writing file: " + e.getMessage());
// //         }
// //     }
// // }