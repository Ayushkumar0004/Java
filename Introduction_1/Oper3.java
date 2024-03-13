// package Introduction_1;
import java.util.Scanner;
public class Oper3 {
    public static void main(String[] args) {
        System.out.println("Enter the marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks >= 96 && marks <= 100) {
            System.out.println("A+");
        } else if (marks >= 91 && marks <= 95) {
            System.out.println("A");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("B+");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("B");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("C+");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("C");
        } else if (marks >= 35 && marks <= 50) {
            System.out.println("D+");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}