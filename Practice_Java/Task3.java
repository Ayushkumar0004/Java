// Using Interfaces for Multiple Inheritance:Define interfaces Flyable and Swimmable representing behaviors of flying and swimming, respectively. Implement classes Bird and Fish that implement Flyable and Swimmable interfaces, respectively. Create objects of Bird and Fish and demonstrate their flying and swimming abilities.
interface Flyable {
    void flying();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable {
    public void flying() {
        System.out.println("Bird is flying.");
    }
}

class Fish implements Swimmable {
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Bird o1 = new Bird();
        o1.flying();
        Fish o2 = new Fish();
        o2.swim();
    }
}
