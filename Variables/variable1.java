package Variables;
import java.util.Scanner;
public class variable1 
{
    public static void main(String[] args)
    {
        System.out.println("The coffee price: ");
        Scanner sc = new Scanner(System.in);
        double coffee_price = sc.nextDouble();
        System.out.print("Number of cups of coffee ordered: ");
        int num_cups = sc.nextInt();
        double total_cost = num_cups * coffee_price;
        System.out.printf("Total Cost: $%.2f",total_cost);
        sc.close();
        
    }
}
