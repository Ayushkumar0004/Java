// class A<M>
// {
//     M a;
//     void fun(M b)
//     {
//         a = b;
//         System.out.println(a);
//     }
// }
// public class Task1 
// {
//     public static void main(String[] args) 
//     {
//         A<Integer> o1= new A<>();
//         o1.fun(10);
//         o1.fun(100);
//         A<String> o2 = new A<>();
//         o2.fun("Hello");
//         A<Float> o3 = new A<>();
//         o3.fun(105.4F);
//         A<Double> o4 = new A<>();
//         o4.fun(105.4);
//     }
// }