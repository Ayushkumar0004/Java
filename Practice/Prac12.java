// Implement a lambda expression to calculate the factorial of a given number. Use a functional interface with a method factorial(int n).
interface Factorial {
    int fact(int n);
}
public class Prac12 {
    public static void main(String[] args) {
        Factorial ft = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        int number = 8;
        System.out.println("The factorial of " + number + " is " + ft.fact(number));
    }
}