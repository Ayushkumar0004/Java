class A {
    int a = 10;
    void fun() {
        class Ayush {
            void AyushFun() {
                System.out.println("Hello Ayush");
            }
        }
        Ayush ob = new Ayush();
        ob.AyushFun();
    }
}

public class Nested2 {
    public static void main(String[] args) {
        A ob1 = new A();
        ob1.fun();
    }
}
