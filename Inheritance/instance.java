class Animal {
}

class Dog extends Animal {

}

class Cat extends Animal {

}

public class instance {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        if (dog instanceof Dog) {
            System.out.println("The animal is a Dog.");
        } else {
            System.out.println("The animal is not a Dog.");
        }
        
        if (cat instanceof Cat) {
            System.out.println("The animal is a Cat.");
        } else {
            System.out.println("The animal is not a Cat.");
        }
    }
}
