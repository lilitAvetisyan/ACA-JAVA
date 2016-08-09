package com.company;

/**
 * Created by Lill on 8/9/16.
 */
public class Lion extends Animal
{
    private String color;
    private String sound;

    public Lion(boolean isAPet, int yearsToLive, Size size)
    {
        super(isAPet, yearsToLive, size);
        this.color = "Yellow";
        this.sound = "Arrrr!";

    }
    public Lion(boolean isAPet, int yearsToLive, Size size, String color, String sound)
    {
        super(isAPet, yearsToLive, size);
        this.color = color;
        this.sound = sound;

    }
    @Override
    public String toString()
    {
        return super.toString() + "\nLion\ncolor: " + color + "\nmakes this sound: " + sound;
    }

    public void voice()
    {
        System.out.println("Arrrr!");
    }
}
