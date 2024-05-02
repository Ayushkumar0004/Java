import java.util.*;
public class Tree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> o1 = new TreeSet<>();
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            o1.add(element);
        }
        System.out.println(o1);
        
        sc.close();
    }
}