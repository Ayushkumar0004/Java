// class Shape {
//     void calculateArea() {
//     }

//     void calculatePerimeter() {
//     }
// }
// class Rectangle extends Shape {
//     int length, breadth;

//     public void setValue(int l, int b) {
//         length = l;
//         breadth = b;
//     }
//     public int getValue() {
//         return length + breadth;
//     }
//     void calculateArea() {
//         int result = length * breadth;
//         System.out.println("Area of rectangle: " + result);
//     }

//     void calculatePerimeter() {
//         int res = 2 * (length + breadth);
//         System.out.println("Perimeter of rectangle : " + res);
//     }
// }
// class Circle extends Shape {
//     double radius;

//     public void setValue(double r) {
//         radius = r;
//     }

//     public double getValue() {
//         return radius;
//     }

//     void calculateArea() {
//         double result = Math.PI * radius * radius;
//         System.out.println("Area of Circle : " + result);
//     }

//     void calculatePerimeter() {
//         double res = 2 * Math.PI * radius;
//         System.out.println("Perimeter of Circle : " + res);
//     }
// }

// public class Task1 {
//     public static void main(String[] args) {
//         Rectangle o1 = new Rectangle();
//         o1.setValue(7, 3);
//         System.out.println("The value of length and breadth is : " + o1.getValue());
//         Circle o2 = new Circle();
//         o2.setValue(5.4);
//         System.out.println("The radius is : " + o2.getValue());
//         o1.calculateArea();
//         o1.calculatePerimeter();
//         o2.calculateArea();
//         o2.calculatePerimeter();
//     }
// }