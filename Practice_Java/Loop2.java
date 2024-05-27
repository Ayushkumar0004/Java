import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s1 = sc.nextLine();
        sc.close(); // Close the scanner to prevent resource leak
        
        // Create a StringBuilder object and append characters in reverse order
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length() - 1; i >= 0; i--) {
            sb.append(s1.charAt(i));
        }
        
        // Convert StringBuilder back to a string and print the reversed string
        String reversedString = sb.toString();
        System.out.println("Reversed String: " + reversedString);
    }
}