import java.util.*;
import java.io.*;

public class Filehandle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the name of the first File: ");
            String fileName1 = sc.nextLine();
            File file1 = new File(fileName1);
            if (file1.createNewFile()) {
                System.out.println("File created successfully");
            }
            FileWriter writer1 = new FileWriter(file1);
            System.out.println("Enter content for first file: ");
            String content1 = sc.nextLine();
            writer1.write(content1);
            writer1.close();

            System.out.println("Enter the name of the second file: ");
            String fileName2 = sc.nextLine();
            File file2 = new File(fileName2);
            if (file2.createNewFile()) {
                System.out.println("File created successfully");
            }
            FileWriter writer2 = new FileWriter(file2);
            System.out.println("Enter content for second file: ");
            String content2 = sc.nextLine();
            writer2.write(content2);
            writer2.close();

            FileReader reader1 = new FileReader(file1);
            FileReader reader2 = new FileReader(file2);

            int charRead1;
            int charRead2;
            boolean isSame = true;

            while ((charRead1 = reader1.read()) != -1 && (charRead2 = reader2.read()) != -1) {
                if (charRead1 != charRead2) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                System.out.println("Content is same");
            } else {
                System.out.println("The content is not same");
            }

            reader1.close();
            reader2.close();
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}