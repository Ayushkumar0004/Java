import java.util.Scanner;

public class Jacked {
    public static void main(String[] args) {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        rows = sc.nextInt();
        int jaggedArr[][] = new int[rows][];
        
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter the number of columns for row " + (i + 1) + ":");
            cols = sc.nextInt();
            jaggedArr[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the value for row " + (i + 1) + ", column " + (j + 1) + ":");
                jaggedArr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}