interface A<T>
{
    void fun(T a);
}
public class Interface1 {
    public Integer fun(Integer a)
    {
        System.out.println(a);
        return a;
    }
    public static void main(String[] args) {
        Interface1 o1 = new Interface1();
        o1.fun(10);
        }
}
