import java.util.Scanner;
public class arr2 {
    public static void main(String[] args) {
        Scanner sub = new Scanner(System.in);
        System.out.println("Enter the no of subjects: ");
        int sb = sub.nextInt();
        int[] marks = new int[sb];
        System.out.println("Enter your Marks for each subject :");
        float totalMarks = 0;
        for (int i = 0; i < sb; i++) {
            marks[i] = sub.nextInt();
            totalMarks += marks[i];
        }
        float percentage = (totalMarks / (sb * 100)) * 100;
        System.out.println("Percentage: " + percentage + "%");
        sub.close();
    }
}