package com.company;

/**
 * Created by Lill on 8/9/16.
 */
public class Dog extends Animal
{
    private String color;
    private String sound;

    public Dog(boolean isAPet, int yearsToLive, Size size)
    {
        super(isAPet, yearsToLive, size);
        this.color = "Brown";
        this.sound = "Woof!";

    }
    public Dog(boolean isAPet, int yearsToLive, Size size, String color, String sound)
    {
        super(isAPet, yearsToLive, size);
        this.color = color;
        this.sound = sound;

    }

    public void voice()
    {
        System.out.println("Woof!");
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nDog\ncolor: " + color + "\nmakes this sound: " + sound;
    }
}
