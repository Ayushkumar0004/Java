// Create a system for managing an online shopping platform with products, customers, and orders. Design an interface called Product with methods for calculating price and displaying product details. Implement classes for different types of products (e.g., electronics, clothing) that inherit from the Product interface and provide specific implementations for price calculation.
interface Product
{
    double calculatePrice();
    void displayProduct();
}
class electronics implements Product
{
    private String name;
    private String brand;
    private int price;
    public electronics(String name, String brand, int price)
    {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
    public double calculatePrice()
    {
        return price;
    }
    public void displayProduct()
    {
        System.out.println("The name is: " + name);
        System.out.println("The brand is: " + brand);
        System.out.println("The price of the item is: " + price);
    }
}

class clothing implements Product
{
    private String name;
    private String brand;
    private int price;
    private String color;
    public clothing(String name, String brand, int price, String color)
    {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    public double calculatePrice()
    {
        return price;
    }
    public void displayProduct()
    {
        System.out.println("The name is: " + name);
        System.out.println("The brand is: " + brand);
        System.out.println("The price of the item is: " + price);
        System.out.println("The color of the cloth is: " + color);
    }
}
public class Prac5 {
    public static void main (String[] args)
    {
        electronics elec = new electronics("Laptop","HP", 65000);
        System.out.println("Details: " + elec.calculatePrice());
        elec.displayProduct();
        clothing cloth = new clothing("Shirt", "Louis vuitton", 25000, "white");
        cloth.displayProduct();
    }
}