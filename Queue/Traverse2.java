import java.util.*;
public class Traverse2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Key: ");
            String key = sc.next();
            System.out.print("Value: ");
            int value = sc.nextInt();
            map.put(key, value);
        }
        for(Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println("Key : " + e.getKey() + " Value: " + e.getValue());
        }
        System.out.println("Enter a  searching  value:");
        String searchKey = sc.next();
        Integer searchValue = map.get(searchKey);
        if (searchValue != null) {
            System.out.println("Value " + searchKey + "' is: " + searchValue);
        } else {
            System.out.println("Key '" + searchKey + "' not found in the HashMap.");
        }
        sc.close();
    }
}