// package Inheritance;
interface A {
    int rollNo = 01;

    void fun();
}
class B implements A {
    public void fun() {
        rollNo = 10;
        System.out.println("This is Ayush");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        B o1 = new B();
        o1.fun();
    }
}
