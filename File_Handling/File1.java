import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) {
        try {
            File f0 = new File("D");
            if (f0.createNewFile()) {
                System.out.println("File " + f0.getName() + " is created successfully.");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }
    }
}
