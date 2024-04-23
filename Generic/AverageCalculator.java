// // package Generic;
// // class A<T, U>
// // {
// //     T a;
// //     void fun(Integer b, U s)
// //     {
// //         s = b + (Integer) a;
// //         System.out.println(s);
// //     }
// // }
// // public class Operation {
// //     public static void main(String[] args) {
// //         A<Integer, Integer> o1 = new A<Integer, Integer>();
// //         o1.a = 10;
// //         o1.fun(20, null);
// //     }
// // }

// import java.util.Arrays;

// public class AverageCalculator<T extends Number> {
//     public double calculateAverage(T[] numbers) {
//         double sum = 0;
//         for (T number : numbers) {
//             sum += number.doubleValue();
//         }
//         return sum / numbers.length;
//     }

//     public static void main(String[] args) {
//         AverageCalculator<Integer> integerCalculator = new AverageCalculator<>();
//         Integer[] integerNumbers = {1, 2, 3, 4, 5};
//         System.out.println("Average of integers: " + integerCalculator.calculateAverage(integerNumbers));

//         AverageCalculator<Double> doubleCalculator = new AverageCalculator<>();
//         Double[] doubleNumbers = {1.1, 2.2, 3.3, 4.4, 5.5};
//         System.out.println("Average of doubles: " + doubleCalculator.calculateAverage(doubleNumbers));
//     }
// }