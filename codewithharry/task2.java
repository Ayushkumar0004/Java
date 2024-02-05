import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSubjects;
        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();
        String[] subjectNames = new String[numSubjects];
        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the name of Subject " + (i + 1) + ": ");
            subjectNames[i] = scanner.next();

            System.out.print("Enter the marks for Subject " + subjectNames[i] + ": ");
            marks[i] = scanner.nextInt();
        }
        double totalPoints = 0;
        for (int i = 0; i < numSubjects; i++) {
            totalPoints += calculateGradePoints(marks[i]);
        }
        double cgpa = totalPoints / numSubjects;
        System.out.println("\nCGPA: " + cgpa);
        scanner.close();
    }
    private static double calculateGradePoints(int marks) {
        if (marks >= 90) {
            return 4.0;
        } else if (marks >= 80) {
            return 3.0;
        } else if (marks >= 70) {
            return 2.0;
        } else if (marks >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}