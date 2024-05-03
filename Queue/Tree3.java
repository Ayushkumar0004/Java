// import java.util.TreeSet;
// class Myclass implements Comparable<Myclass> {
//     private int value;

//     public Myclass(int v) {
//         this.value = v;
//     }

//     public int getValue() {
//         return value;
//     }
//     @Override
//     public int compareTo(Myclass other) {
//         return Integer.compare(this.value, other.value);
//     }
// }
// public class Tree3 {
//     public static void main(String[] args) {
//         TreeSet<Myclass> myTreeSet = new TreeSet<>();
//         myTreeSet.add(new Myclass(5));
//         myTreeSet.add(new Myclass(3));
//         myTreeSet.add(new Myclass(8));
//         System.out.println("Elements in TreeSet: ");
//         for (Myclass o1 : myTreeSet) {
//             System.out.println(o1.getValue());
//         }
//     }
// }