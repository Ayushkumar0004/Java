// Write a lambda expression to find the maximum of two numbers. Use a functional interface with a method findMax(int a, int b).
@FunctionalInterface
interface maximum
{
    void max(int x, int y);
}
public class Prac9 {
    public static void main(String[] args) {
        maximum m1 = (x, y) -> 
        {
            if(x > y)
            {
                System.out.println(x);
            }
            else
            {
                System.out.println(y);
            }
        };
        m1.max(10,60);
    }
}