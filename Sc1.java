import java.util.Scanner;
public class Sc1 {
    public static void main(String[] args)
    {
        Scanner ak = new Scanner(System.in);
        int a = ak.nextInt();
        float b = ak.nextFloat();
        char c = ak.next().charAt(0);
        String d = ak.nextLine();
        String e = ak.next();
        System.out.println("Value is : " + a);
        System.out.println("Value is : " + b);
        System.out.println("Value is : " + c);
        System.out.println("Value is : " + d);
        System.out.println("Value is : " + e);
        ak.close();
    }
}