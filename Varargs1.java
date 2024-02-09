public class Varargs1 {
    void fun(int a) {
        System.out.println(a);
    }

    void fun(int... a) {
        System.out.println("-------------");
        for (int i : a) {
            System.out.println(i);
        }
    }

    void fun(int a, float b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        Varargs1 sc = new Varargs1();
        sc.fun(1);
        sc.fun(1, 2, 3, 4, 5);
        sc.fun(5, 15.47f);
    }
}