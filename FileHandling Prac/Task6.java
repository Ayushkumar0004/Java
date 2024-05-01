import java.io.*;

public class Task6 {
    public static void main(String[] args) {
        try {
            File file = new File("Dest.txt");

            // Check if the file exists before attempting to delete it
            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            // Attempt to delete the file
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (SecurityException e) {
            System.out.println("Security Exception occurred: " + e.getMessage());
        }
    }
}
