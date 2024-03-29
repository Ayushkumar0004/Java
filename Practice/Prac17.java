// Interface Polymorphism:

// Define an interface called Playable with a method void play().
// Create classes Video and Audio that implement the Playable interface.
// Implement the play() method in each class to display "Playing video" and "Playing audio" respectively.
// Write a method that accepts an array of Playable objects and invokes the play() method on each object.
interface Playable
{
    void play();
}
class Video implements Playable
{
    public void play()
    {
        System.out.println("This is Video File");
    }
}
class  Audio implements Playable
{
    public void play()
    {
        System.out.println("This is Audio File");
    }
}
public class Prac17 {
    public static void playAll(Playable[] items)
    {
        for(Playable  item : items)
        item.play();
    }
    public static void main(String[] args) {
        Playable[] items = {new Video(), new Audio()};
        playAll(items);
    }
}