import java.util.Scanner;
public class Control1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(isLeapyear(year))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
        sc.close();
    }
    public static boolean isLeapyear(int year)
    {
        if(year % 4 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}