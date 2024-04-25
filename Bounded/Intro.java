class A<T extends Number>
{
    T a;
    void fun(T b)
    {
        a = b;
        System.out.println(a);
    }
}
public class Intro
{
    public static void main(String[] args) 
    {
        A<Integer> o1 = new A<>();   
        o1.fun(10);
        A<Float> o2  = new A<>();
        o2.fun(15.4F);
        A<Double> o3 = new A<>();
        o3.fun(14.457);
    }
}