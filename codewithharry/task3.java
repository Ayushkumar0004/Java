import java.util.Scanner;
public class task3 {
    public static void main(String[] args)
    {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = sc.next();
        System.out.println("Hello " + name + " Have a good day!");
        System.out.println("Hello " + name + " I love you from deep of my heart!");
        sc.close();
    }
}