// Generic Class Implementation:
// Write a generic class Box that can store any type of object. It should have methods to set and get the value it stores.
public class Task10<T> {
    private T value;
    public Task10(T value)
    {
        this.value = value;
    }
    public T getValue()
    {
        return value;
    }
    public  void setValue(T newValue)
    {
        this.value = newValue;
    }
    
    public static void main(String[] args) {
        Task10<String> o1 = new Task10<>("H");
        System.out.println("The object's value is " + o1.getValue());
        o1.setValue("Hello");
        System.out.println(o1.getValue());
    }
}