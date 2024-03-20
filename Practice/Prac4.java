// // Create an interface called Shape with methods calculateArea() and calculatePerimeter(). Then implement this interface in classes Circle, Rectangle, and Triangle to calculate their respective areas and perimeters.
// interface Shape
// {
//     void calculateArea();
//     void calculatePerimeter();
// }
// class Circle implements Shape
// {
//     private int r;
//     public int getR()
//     {
//         return r;
//     }
//     public void setR(int R)
//     {
//         this.r = R;
//     }
//     public void calculateArea()
//     {
//        double result = Math.PI * r * r;
//        System.out.println("Area of Circle: " + result);
//     }
//     public void calculatePerimeter()
//     {
//         double R = 2 * Math.PI * r;
//         System.out.println("Perimeter: " + R);
//     }
// }
// class Rectangle implements  Shape
// {
//     private double l;
//     private double b;
//     public Rectangle(double l, double b)
//     {
//         this.l = l;
//         this.b = b;
//     }
//     public void calculateArea()
//     {
//        double result = l * b;
//        System.out.println("Area of Rectangle: " + result);
//     }
//     public void calculatePerimeter()
//     {
//         double r = 2 * (l + b);
//         System.out.println("Perimeter: " + r);
//     }
// }
// class Triangle implements  Shape
// {
//     private double b;
//     private double h;
//     public Triangle(double b, double h)
//     {
//         this.b = b;
//         this.h = h;
//     }
//     public void calculateArea()
//     {
//         double result = 0.5 * b * h;
//         System.out.println("Area of triangle: " + result);
//     }
// }
// public class Prac4 {
//     public static void main(String[] args)
//     {
//         Circle circle = new Circle();
//         circle.setR(10);
//         circle.calculateArea();
//         circle.calculatePerimeter();
//         Triangle t = new Triangle(5, 8);
//         t.calculateArea();
//         t.calculatePerimeter();
//         Rectangle rec = new  Rectangle(6, 9);
//         rec.calculateArea();
//     }
// }