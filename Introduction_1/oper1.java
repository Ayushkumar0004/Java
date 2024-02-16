package Introduction_1;
public class oper1 
{
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 3;
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        if (max == a) {
            System.out.println("a is the greatest number: " + a);
        } else if (max == b) {
            System.out.println("b is the greatest number: " + b);
        } else {
            System.out.println("c is the greatest number: " + c);
        }
    }
}