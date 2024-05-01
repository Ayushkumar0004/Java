// import java.util.*;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// public class Task2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         try {
//             FileWriter F = new FileWriter("New.txt");
//             F.write(str);
//             F.close(); // Close the FileWriter after writing

//             FileReader f1 = new FileReader("New.txt");
//             int i;
//             while ((i = f1.read()) != -1) {
//                 System.out.print((char) i);
//             }
//             f1.close(); // Close the FileReader after reading
//         } catch (IOException e) {
//             System.out.println(e);
//         } finally {
//             sc.close();
//         }
//     }
// }
