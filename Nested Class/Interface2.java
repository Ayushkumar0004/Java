// interface Fibo {
//     int generate();
// }
// public class Interface2 {
//     public static void main(String[] args) {
//         Fibo fibonacci = new Fibo() {
//             int previous = 0;
//             int current = 1;
//             public int generate() {
//                 int next = previous + current;
//                 previous = current;
//                 current = next;
//                 return previous;
//             }
//         };
//         System.out.println("Fibonacci Series: ");
//         for (int i = 0; i < 10; i++) {
//             System.out.println(fibonacci.generate());
//         }
//     }
// }