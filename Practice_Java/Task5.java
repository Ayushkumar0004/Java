// // Design a Person class with private attributes such as name, age, and gender. Use encapsulation techniques to provide access to these attributes through getter and setter methods.
// // Extend the Person class to create a Student subclass with additional attributes like studentID and major. Ensure that these attributes are encapsulated.
// class Person 
// {
//     private String name;
//     private int age;
//     private String gender;
//     public Person(String n,int a, String g)
//     {
//         this.name = n;
//         this.age = a;
//         this.gender = g;
//     }
//     public String getname()
//     {
//         return name;
//     }
//     public int getage()
//     {
//         return age;
//     }
//     public String getGen()
//     {
//         return gender;
//     }
// }
// class Student extends Person {
//     private int studentID;
//     private String major;

//     public Student(String name, int age, String gender, int studentID, String major) {
//         super(name, age, gender);
//         this.studentID = studentID;
//         this.major = major;
//     }

//     public int getStudentID() {
//         return studentID;
//     }

//     public void setStudentID(int studentID) {
//         this.studentID = studentID;
//     }

//     public String getMajor() {
//         return major;
//     }

//     public void setMajor(String major) {
//         this.major = major;
//     }
// }
// public class Task5 {
//     public static void main(String[] args) {
//         Person person = new Person("Ayush", 19, "Male");
//         System.out.println(person.getname());
//         System.out.println(person.getage());
//         System.out.println(person.getGen());

//         Student student = new Student("Alice", 20, "Female", 123456, "Computer Science");
//         System.out.println(student.getname());
//         System.out.println(student.getage());
//         System.out.println(student.getGen());
//         System.out.println(student.getStudentID());
//         System.out.println(student.getMajor());
//     }
// }