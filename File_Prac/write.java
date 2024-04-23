// // package File_Prac;
// import java.io.FileWriter;
// import java.io.IOException;

// public class write {
//     public static void main(String[] args) {
//         try{
//             FileWriter f = new FileWriter("Data.txt");
//             try
//             {
//                 f.write("Hello World!");
//             }
//             finally{
//                 f.close();
//             }
//             System.out.println("Successfully wrote the data");
//         }
//         catch(IOException e)
//         {
//             System.out.println("Error");
//         }
//     }
// }