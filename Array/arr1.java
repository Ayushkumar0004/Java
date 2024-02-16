package Array;
import java.util.Scanner;
public class arr1 {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.print("Array values are: " + a);
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.print("Array values are: " + b);
        int[] c = new int[10];
        System.out.println("Enter the array values: ");
        for (int i = 0; i < 10; i++) {
            c[i] = ak.nextInt();
        }
        System.out.print("Array values are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }
        ak.close();
    }
}