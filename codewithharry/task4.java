//Converting kilometers to miles
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        double kilometers, miles;
        System.out.print("Enter the distance in kilometers: ");
        Scanner sc = new Scanner(System.in);
        kilometers = sc.nextDouble();
        miles = kilometers * 0.621371;
        System.out.printf("%.2f kilometers is equal to %.2f miles.", kilometers, miles);
        sc.close();
    }
}