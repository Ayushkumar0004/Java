class A<M, T, U, Y> {
    M a;
    T d;
    
    void fun(M b, T c) {
        a = b;
        d = c;
        System.out.println(b);
        System.out.println(c);
    }
}

public class MultipleGeneric {
    public static void main(String[] args) {
        A<Integer, String, Double, Boolean> obj1 = new A<>();
        A<String, Integer, Boolean, Double> obj2 = new A<>();
        obj1.fun(10, "abc");
        obj2.fun("Hello", 20);
    }
}
