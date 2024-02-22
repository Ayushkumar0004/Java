interface A {
    void methodA();
}
interface B extends A {
    void methodB();
}
class C implements B {
    public void methodA() {
        System.out.println("Inside methodA of class C");
    }

    public void methodB() {
        System.out.println("Inside methodB of class C");
    }
}

class D extends C {
    public void methodC() {
        System.out.println("Inside methodC of class D");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.methodB();
        obj.methodC(); 
    }
}
