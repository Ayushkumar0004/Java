package Introduction_1;
public class task2 {
    public static void main(String[] args) {
        printStarTriangle(7);
    }
    static void printStarTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}