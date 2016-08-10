
/**
 * Created by Lill on 8/9/16.
 */
public class Dog extends Animal
{
    private String sound;
    private boolean livesAtHome;

    public Dog(int yearsToLive, Size size, String color)
    {
        super( yearsToLive, size, color);
        this.sound = "Woof!";
        this.livesAtHome = true;

    }
    public Dog(int yearsToLive, Size size, String color, String sound, boolean livesAtHome)
    {
        super( yearsToLive, size, color);
        this.sound = sound;
        this.livesAtHome = livesAtHome;

    }

//    public void voice()
//    {
//        System.out.println("Woof!");
//    }

    @Override
    public String toString()
    {
        return super.toString() + "\nDog"+ "\nmakes this sound: " + sound + "\nlives at home: " + livesAtHome;
    }
}
