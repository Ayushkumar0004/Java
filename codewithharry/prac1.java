import java.util.Scanner;
public class prac1 {
    public static void main(String[] arg) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for a: ");
        a = sc.nextInt();
        System.out.print("Enter the value for b: ");
        b = sc.nextInt();
        System.out.print("Enter the value for c: ");
        c = sc.nextInt();
        sc.close();
        int sum = a + b + c;
        System.out.println("The sum is: " + sum);
    }
}