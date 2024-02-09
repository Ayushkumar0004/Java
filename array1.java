public class array1 {
    void func(int[] aa) {
        for(int k : aa)
            System.out.println(k);
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Array a:");
        for(int i : a)
            System.out.println(i);
        int[] b;
        b = a.clone();
        System.out.println("Array b (cloned from a):");
        for(int j : b)
            System.out.println(j);
        b[2] = 1000;
        System.out.println("Modified array b:");
        for(int j : b)
            System.out.println(j);

        array1 mk = new array1();
        System.out.println("Printing array b using func method:");
        mk.func(b);
    }
}