// Interface Inheritance: Create an interface Mammal with a method giveBirth(). Implement classes Human and Dog that implement Mammal interface. Then, create a new interface Pet inheriting from Mammal with a method play(). Implement Dog as a Pet and demonstrate its methods.
interface Mammal {
    void giveBirth();
}
class Human implements Mammal {
    @Override
    public void giveBirth() 
    {
        System.out.println("Humans give birth to live young.");
    }
}
class Dog implements Mammal {
    @Override
    public void giveBirth() 
    {
        System.out.println("Dogs give birth to puppies.");
    }
}
interface Pet extends Mammal 
{
    void play();
}
class DogAsPet extends Dog implements Pet {
    @Override
    public void play() 
    {
        System.out.println("Dog is playing fetch.");
    }
}
public class Task4 {
    public static void main(String[] args) 
    {
        DogAsPet dog = new DogAsPet();
        dog.giveBirth();
        dog.play();
    }
}