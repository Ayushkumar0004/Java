public class Varargs3{
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {
        Varargs3 calculator = new Varargs3();
        double length = 5.0;
        double width = 3.0;
        double height = 4.0;
        double volumeRectangle = calculator.calculateVolume(length, width, height);
        System.out.println("Volume of rectangle: " + volumeRectangle);
        double radius = 2.0;
        double cylinderHeight = 6.0;
        double volumeCylinder = calculator.calculateVolume(radius, cylinderHeight);
        System.out.println("Volume of cylinder: " + volumeCylinder);
    }
}