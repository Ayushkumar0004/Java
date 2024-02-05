package Variables;
public class Variable
{
    static float c = 30.54f;
    float b = 20.41f;
    void func()
    {
        float a = 15.41f;
        float result = a + b + c;
        System.out.println("The sum is: " + result);
        System.out.println(a + " " + b + " " + c);
        c++;
        b++;
        a++;
    }
    public static void main(String[] args) {
        Variable m = new Variable();
        m.func();
        m.func();
        m.func();
    }
}