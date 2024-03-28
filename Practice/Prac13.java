// Implement a program that checks if a given number is prime or not using lambda expressions to define the primality test.
import java.util.Scanner;

@FunctionalInterface
interface Prime {
    void checkPrime(int n);
}

public class Prac13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prime pm = (n) -> {
            boolean isPrime = true;
            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        };

        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        pm.checkPrime(input);
        sc.close();
    }
}