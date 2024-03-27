// mplement a lambda expression to check whether a given integer is even or odd. Use a functional interface with a method check(int num) returning a boolean.
@FunctionalInterface
interface EvenOdd {
    boolean check(int num);
}
public class Prac11 {
    public static void main(String[] args) {
        EvenOdd ev = (n) -> {
            if (n % 2 == 0) {
                return true;
            } 
            else 
            {
                return false;
            }
        };

        int number = 8;
        if (ev.check(number)) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
    }
}