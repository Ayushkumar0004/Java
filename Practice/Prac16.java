// Define a superclass called Person with properties name and age.
// Create subclasses Teacher and Student which inherit from Person.
// Implement an interface Role with methods void doRole() for both teacher and student roles.
// Write lambda expressions for specific actions related to each role, such as teaching for a teacher and studying for a student.
import java.util.Scanner;
class Person
{
    private String name;
    private int age;
    public  Person(String name, int age)
    {
        this.name= name;
        this.age = age;
    }
    String getname()
    {
        return name;
    }
    int getage()
    {
        return age;
    }
}
class Teacher extends Person implements Role
{
    public Teacher(String name, int age)
    {
        super(name, age);
    }
    public void doRole()
    {
        System.out.println("Teaching......");
    }
}
class Student extends Person implements Role
{
    public Student(String name,int age)
    {
        super(name, age);
    }
    public void doRole()
    {
        System.out.println("Studying......");
    }
}
interface Role{
    void doRole();
}
public class Prac16 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        // System.out.println("Enter the number of people: ");
        // int n=sc.nextInt();
        // for(int i = 0; i <= n; i++)
        // {

        // }
        Teacher tt = new Teacher("AYUSH", 29);
        Student st= new Student("Manjodh", 20);
        System.out.println(tt.getage());
        System.out.println(st.getage());
        System.out.println(tt.getname());
        System.out.println(st.getname());
        Role RT = ()->
        {
            tt.doRole();
        };
        Role RS = ()->
        {
            st.doRole();
        };
        RT.doRole();
        RS.doRole();
    sc.close();
    }
}