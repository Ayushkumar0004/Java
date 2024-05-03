import java.util.*;
class Myclass implements Comparable<Myclass> {
    private int value;

    public Myclass(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Myclass other) {
        return Integer.compare(this.value, other.value);
    }
}
public class ArrayListTree {
    public static void main(String[] args) {
        ArrayList<Myclass> myArrayList = new ArrayList<>();
        myArrayList.add(new Myclass(5));
        myArrayList.add(new Myclass(3));
        myArrayList.add(new Myclass(8));
        Collections.sort(myArrayList);
        System.out.println("Elements in ArrayList: ");
        for (Myclass o1 : myArrayList) {
            System.out.println(o1.getValue());
        }
    }
}