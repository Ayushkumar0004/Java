class hello{
    int a=10;
    int b=20;
    void fun(){
    }
    public String toString(){
    return "hello Mukesh Sharma";
    }
    public boolean equals (hello neww){
    return this.a==neww.a && this.b==neww.b;
    }
    }
    public class Objectclass {
    public static void main(String[] args) {
    hello ob=new hello();
    hello ob1=new hello();
    System.out.println(ob);
    System.out.println(ob1.toString());
    System.out.println(ob.equals(ob));
    }
    }