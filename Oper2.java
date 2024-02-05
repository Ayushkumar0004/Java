import java.util.Scanner;
public class Oper2 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the name of the day: ");
        Scanner sc = new Scanner(System.in);
        int Days = sc.nextInt();
        switch(Days)
        {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thrusday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Invalid number!");
        }
        sc.close();
    }
}