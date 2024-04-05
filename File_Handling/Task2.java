import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            File file = new File("D");
            Scanner dataReader;
            dataReader = new Scanner(file);
            while (dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            dataReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }
    }
}
