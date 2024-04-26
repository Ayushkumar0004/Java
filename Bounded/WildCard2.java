import java.util.*;

class Animal {
    void eat() {
        System.out.println("Animal is eating!");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating!");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("Cat is eating!");
    }
}

public class WildCard2 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animals.add(dog);
        animals.add(cat);

        feedAnimals(animals);
    }

    public static void feedAnimals(List<? super Dog> animals) {
        for (Object animal : animals) {
            ((Animal) animal).eat();
        }
    }
}