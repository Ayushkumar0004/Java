// Write a lambda expression to calculate the sum of two integers using a functional interface. The functional interface should have a method calculate(int a, int b)
@FunctionalInterface
interface Operation
{
    public void sum(double a, double b);
}
public class Prac8
{
    public static void main(String[] args) {
        Operation op = (a, b) -> System.out.println(a + b);
        op.sum(10 , 8.7);
    }
}