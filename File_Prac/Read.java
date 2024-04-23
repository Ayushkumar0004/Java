// // package File_Prac;

// import java.io.FileReader;
// import java.io.*;
// public class Read
// {
//     public static void main(String[] args){
//         try{
//         FileReader f = new FileReader("Intro.txt");
//         try{
//             int i;
//             while((i = f.read()) != -1)
//             {
//                 System.out.print((char)(i));
//             }
//         }
//         finally{
//             f.close();
//         }
//     }
//         catch(IOException e)
//         {
//             System.out.println("Error");
//         }
//     }
// }