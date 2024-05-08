// Write a functional interface MathOperation with a method int operate(int a, int b). Implement lambda expressions for addition, subtraction, multiplication, and division using this interface.
// Create a method performOperation(int a, int b, MathOperation operation) which takes two integers and a functional interface as parameters and performs the operation.
// Use this method to perform various arithmetic operations on two integers using lambda expressions.

interface MathOperation {
    int operate(int a, int b);
}

public class Lambda1 {
    public static void main(String[] args) {
        MathOperation o1 = (a, b) -> a + b;
        System.out.println("Addition : " + o1.operate(4, 8));

        MathOperation o2 = (a, b) -> a - b;
        System.out.println("Subtraction : " + o2.operate(4, 8));

        MathOperation o3 = (a, b) -> a * b;
        System.out.println("Multiplication : " + o3.operate(4, 8));

        MathOperation o4 = (a, b) -> a / b;
        System.out.println("Division : " + o4.operate(4, 8));
    }
}
