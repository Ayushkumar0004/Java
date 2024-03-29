class ayush
{
    int fun() throws ArithmeticException
    {
        int a = 10, b=0, c;
        c = a / b;
        return c;
    }
}

public class Throw1 {
    public static void main(String[] args) {
    ayush aj =  new ayush();
    try
    {
        aj.fun();
    }
    catch(Exception e)
    {
        System.out.println("This is main catch");
        System.out.println(e);
    }
}
}