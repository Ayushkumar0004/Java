class A {
    A() {
        System.out.println("This is Class A");
    }
}
class B extends A {
    void fun() {
        super();
        System.out.println("This is Class B");
    }
}
class C extends B {
    C() {
        System.out.println("This is Class C");
    }
}
public class Intro {
    public static void main(String[] args) {
        C o1 = new C();
        o1.fun();
    }
}