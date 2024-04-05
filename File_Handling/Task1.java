// import java.io.File;
// import java.io.IOException;
// import java.nio.file.Files;

// public class Task1 {
//     public static void main(String[] args) {
//         int numFilesToCreate = 5;

//         for (int i = 0; i < numFilesToCreate; i++) {
//             String newFileName = "new_example_" + i + ".txt";
//             File newFile = new File(newFileName);

//             try {
//                 Files.write(newFile.toPath(), "42".getBytes());

//                 System.out.println("New file created: " + newFileName);
//             } catch (IOException e) {
//                 System.out.println("Error creating new file: " + e.getMessage());
//             }
//         }
//     }
// }