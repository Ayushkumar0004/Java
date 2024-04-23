import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("Data.txt");
            FileWriter f1 = new FileWriter("Data1.txt");
            
            // Write "Ayush" to Data1.txt
            f1.write("Ayush");
            
            // Copy contents from Data.txt to Data1.txt
            int i;
            while((i = f.read()) != -1) {
                f1.write((char)i);
            }
            
            System.out.println("Data copied successfully");
            
            // Close file streams
            f.close();
            f1.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
