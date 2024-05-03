import java.util.*;
public class BinarySearchAndSort 
{    
    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<>();
        dataList.add(5);
        dataList.add(8);
        dataList.add(2);
        dataList.add(10);
        dataList.add(3);
        Collections.sort(dataList);
        int target = 2;
        int index = binarySearch(dataList, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the list.");
        }
    }
    public static int binarySearch(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (list.get(mid) == target) {
                return mid;
            } else if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}