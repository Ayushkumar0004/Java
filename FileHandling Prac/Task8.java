// Write a Java program that concatenates the content of two text files into a new file. The user should input the names of the two input files and the name of the output file. Implement exception handling to catch and handle any errors that may occur during file input/output operations, such as file not found or file reading errors.
import java.io.*;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        try {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);
            
            // Get the names of the input files from the user
            System.out.print("Enter the name of the first input file: ");
            String inputFile1 = scanner.nextLine();
            System.out.print("Enter the name of the second input file: ");
            String inputFile2 = scanner.nextLine();
            
            // Get the name of the output file from the user
            System.out.print("Enter the name of the output file: ");
            String outputFile = scanner.nextLine();
            
            // Open the input files for reading
            FileReader fileReader1 = new FileReader(inputFile1);
            FileReader fileReader2 = new FileReader(inputFile2);
            
            // Create a FileWriter to write to the output file
            FileWriter fileWriter = new FileWriter(outputFile);
            
            // Read the content of the first input file and write it to the output file
            int character;
            while ((character = fileReader1.read()) != -1) {
                fileWriter.write(character);
            }
            
            // Read the content of the second input file and append it to the output file
            while ((character = fileReader2.read()) != -1) {
                fileWriter.write(character);
            }
            
            // Close the file readers and writer
            fileReader1.close();
            fileReader2.close();
            fileWriter.close();
            scanner.close();
            
            System.out.println("Files concatenated successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
