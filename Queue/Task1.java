// import java.util.*;

// public class Task1 {
//     int rollNo;
//     String name, address;

//     public Task1(int rollNo, String name, String address) {
//         this.rollNo = rollNo;
//         this.name = name;
//         this.address = address;
//     }

//     @Override
//     public String toString() {
//         return this.rollNo + " " + this.name + " " + this.address;
//     }

//     public static class SortByRoll implements Comparator<Task1> {
//         @Override
//         public int compare(Task1 a, Task1 b) {
//             return Integer.compare(a.rollNo, b.rollNo);
//         }
//     }

//     public static class SortByName implements Comparator<Task1> {
//         @Override
//         public int compare(Task1 a, Task1 b) {
//             return a.name.compareTo(b.name);
//         }
//     }

//     public static class SortByAddress implements Comparator<Task1> {
//         @Override
//         public int compare(Task1 a, Task1 b) {
//             return a.address.compareTo(b.address);
//         }
//     }

//     public static void main(String[] args) {
//         List<Task1> students = new ArrayList<>();
//         students.add(new Task1(1, "Ayush", "VPO Naharpur"));
//         students.add(new Task1(2, "Manjodh", "Gurdaspur"));
//         students.add(new Task1(3, "Ankit", "Rajasthan"));

//         Collections.sort(students, new Task1.SortByRoll());
//         System.out.println("Sorted by roll number:");
//         for (Task1 student : students) {
//             System.out.println(student);
//         }

//         Collections.sort(students, new Task1.SortByName());
//         System.out.println("\nSorted by name:");
//         for (Task1 student : students) {
//             System.out.println(student);
//         }

//         Collections.sort(students, new Task1.SortByAddress());
//         System.out.println("\nSorted by address:");
//         for (Task1 student : students) {
//             System.out.println(student);
//         }
//     }
// }
