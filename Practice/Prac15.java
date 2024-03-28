// Determine if a given number is a perfect square using a lambda expression.
@FunctionalInterface
interface PerfectSquare {
    boolean isPerfectSquare(int n);
}

public class Prac15 {
    public static void main(String[] args) {
        int num = 20;
        PerfectSquare ps = (n) -> {
            double sqrt = Math.sqrt(n);
            return sqrt == Math.floor(sqrt);
        };

        if (ps.isPerfectSquare(num)) {
            System.out.println(num + " is a perfect square ");
        } else {
            System.out.println(num + " is not a perfect square");
        }
    }
}