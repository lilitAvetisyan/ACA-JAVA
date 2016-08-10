/**
 * Created by Lill on 8/10/16.
 */
public class Fish extends Animal
{
    private String color;
    private String areal; // should be either river or sea

    public Fish(int yearsToLive, Size size)
    {
        super( yearsToLive, size);
        this.color = "Grey";
        this.areal = "Sea";
    }
    public Fish(int yearsToLive, Size size, String color,String areal)
    {
        super( yearsToLive, size);
        this.color = color;
        this.areal = areal;
    }
    @Override
    public String toString()
    {
        return super.toString() + "\nFish\ncolor: " + color + "\nLives in sea or river " + areal;
    }



}
