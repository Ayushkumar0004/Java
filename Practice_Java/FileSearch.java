import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileSearch {
    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner(System.in);
            File o1 = new File("Intro.txt");
            if (o1.createNewFile()) {
                System.out.println("File created successfully");
            }

            // Prompt user for keyword to search
            System.out.print("Enter the keyword to search for: ");
            String keyword = userInput.nextLine();

            // Open the file
            // File file = new File(filePath);
            Scanner fileScanner = new Scanner(o1);

            int lineNumber = 1;

            // Iterate through each line of the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                // Check if the line contains the keyword
                if (line.contains(keyword)) {
                    System.out.println("Line " + lineNumber + ": " + line);
                }
                lineNumber++;
            }

            // Close the scanners
            userInput.close();
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
