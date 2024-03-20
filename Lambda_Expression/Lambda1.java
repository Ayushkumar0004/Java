// // package Lambda_Expression;
// // wap to find the palindrome using lambda expression
// import java.util.Scanner;
// import java.util.function.Predicate;
// public class Lambda1 
// {
//     public static void main(String[] args)
//     {
//         Predicate<String> isPalindrome = s ->
//         {
//             String reversed = new StringBuilder(s).reverse().toString();
//             return  s.equals(reversed);
//             };

//             String s;
//             System.out.println("Enter a string: ");
//             Scanner sc = new Scanner(System.in);
//             s = sc.nextLine();
//             sc.close();
//         if(isPalindrome.test(s))
//         {
//             System.out.println(s + " is Palindrome.");
//         }
//         else
//         {
//             System.out.println(s +  " is not  Palindrome.");
//         }
//     }
// }
