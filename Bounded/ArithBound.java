// class A<T extends Number>
// {
//     T a;
    
//     void set(T b) {
//         a = b;
//     }
//     T add(T b) {
//         return (T) (Number) (a.doubleValue() + b.doubleValue());
//     }
//     T subtract(T b) {
//         return (T) (Number) (a.doubleValue() - b.doubleValue());
//     }
//     T multiply(T b) {
//         return (T) (Number) (a.doubleValue() * b.doubleValue());
//     }
//     T divide(T b) {
//         return (T) (Number) (a.doubleValue() / b.doubleValue());
//     }
//     void fun(T b)
//     {
//         a = b;
//         System.out.println("Value: " + a);
//     }
// }

// public class ArithBound
// {
//     public static void main(String[] args) 
//     {
//         A<Integer> o1 = new A<>();   
//         o1.fun(10);
//         System.out.println("Addition: " + o1.add(5));
//         System.out.println("Subtraction: " + o1.subtract(3));
//         System.out.println("Multiplication: " + o1.multiply(2));
//         System.out.println("Division: " + o1.divide(2));
        
//         A<Float> o2  = new A<>();
//         o2.fun(15.4F);
//         System.out.println("Addition: " + o2.add(3.6f));
//         System.out.println("Subtraction: " + o2.subtract(5.4f));
//         System.out.println("Multiplication: " + o2.multiply(2.5f));
//         System.out.println("Division: " + o2.divide(3.5f));
        
//         A<Double> o3 = new A<>();
//         o3.fun(14.457);
//         System.out.println("Addition: " + o3.add(3.543));
//         System.out.println("Subtraction: " + o3.subtract(2.457));
//         System.out.println("Multiplication: " + o3.multiply(2.5));
//         System.out.println("Division: " + o3.divide(1.3));
//     }
// }
