class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    void wagTail() {
        System.out.println("Dog wags its tail");
    }
}

class Cat extends Animal {
    boolean isLongHair;

    Cat(String name, int age, boolean isLongHair) {
        super(name, age);
        this.isLongHair = isLongHair;
    }

    void purr() {
        System.out.println("Cat purrs");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Labrador");
        Cat shortHairCat = new Cat("Whiskers", 5, false);
        Cat longHairCat = new Cat("Fluffy", 2, true);

        System.out.println("Dog:");
        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age);
        System.out.println("Breed: " + dog.breed);

        System.out.println("\nShort Hair Cat:");
        System.out.println("Name: " + shortHairCat.name);
        System.out.println("Age: " + shortHairCat.age);
        System.out.println("Is Long Hair: " + shortHairCat.isLongHair);

        System.out.println("\nLong Hair Cat:");
        System.out.println("Name: " + longHairCat.name);
        System.out.println("Age: " + longHairCat.age);
        System.out.println("Is Long Hair: " + longHairCat.isLongHair);

        System.out.println("\nCommon properties:");
        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age);

        System.out.println("\nDifferent properties:");
        System.out.println("Dog Breed: " + dog.breed);
        System.out.println("Short Hair Cat is Long Hair: " + shortHairCat.isLongHair);
        System.out.println("Long Hair Cat is Long Hair: " + longHairCat.isLongHair);
    }
}