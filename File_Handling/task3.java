// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;

// public class task3 {
//     public static void main(String[] args) {
//         String sourceFile = "source.txt";
//         String destinationFile = "Destination.txt";
//         try {
//             FileInputStream inputStream = new FileInputStream(sourceFile);
//             FileOutputStream outputStream = new FileOutputStream(destinationFile);
//             int byteData;
//             while ((byteData = inputStream.read()) != -1) {
//                 outputStream.write(byteData);
//             }
//             inputStream.close();
//             outputStream.close();
//             System.out.println("File copied successfully.");
//         } catch (IOException e) {
//             System.out.println("An error occurred while copying the file.");
//             e.printStackTrace();
//         }
//     }
// }