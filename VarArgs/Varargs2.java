public class Varargs2 {
    void fun(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is even.");
        } else {
            System.out.println(a + " is odd.");
        }
    }

    void fun(int... a) {
        System.out.println("-------------");
        for (int i : a) {
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
    }

    void fun(int a, float b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        Varargs2 sc = new Varargs2();
        sc.fun(1);
        sc.fun(1, 2, 3, 4, 5);
        sc.fun(5, 15.47f); // Use float literal to match method signature
    }
}
