import java.util.TreeSet;

public class Tree1 {
    public static void main(String[] args) {
        TreeSet<Integer> o1 = new TreeSet<>();
        o1.add(54);
        o1.add(55);
        o1.add(56);
        o1.add(57);
        o1.add(57);
        o1.remove(57);
        System.out.println(o1);
    }
}