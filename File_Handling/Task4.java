// import java.io.BufferedReader;
// import java.io.FileInputStream;
// import java.io.FileReader;
// import java.io.IOException;

// public class Task4 {
//     public static void main(String[] args) {
//         String sourceFile = "source.txt";
//         String longestWord = "";

//         try {
//             BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 String[] words = line.split("\\s+");
//                 for (String word : words) {
//                     word = word.replaceAll("[^a-zA-Z]", "");
//                     if (word.length() > longestWord.length()) {
//                         longestWord = word;
//                     }
//                 }
//             }
//             reader.close();

//             if (!longestWord.isEmpty()) {
//                 System.out.println("Longest word in the file: " + longestWord);
//             } else {
//                 System.out.println("No words found in the file.");
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred while reading the file.");
//             e.printStackTrace();
//         }
//     }
// }
