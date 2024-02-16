public class Intro{
    public static void main(String[] args)
    {
        StringBuilder sc = new StringBuilder("Hello");
        sc.ensureCapacity(23);
        String b = " Ayush";
        System.out.println(sc.capacity());
        System.out.println(sc.length());
        sc.append(b);
        System.out.println(sc);
        // sc.reverse();
        // System.out.println(sc);
        b.toUpperCase();
        System.out.println(b);
        sc.delete(6,13);
        sc.insert(4, "Jerry");
        System.out.println(sc);
        String c = sc.substring(6);
        System.out.println(sc);
        System.out.println(c);
        sc.replace(6,13,"Anurag");
        System.out.println(sc);
    }
}