package com.company;

/**
 * Created by Lill on 8/9/16.
 */
public class Size {
    private int weight;
    private int height;
    private int lenght;

    public Size(int weight, int height, int lenght)
    {
        super();
        this.weight = weight;
        this.height = height;
        this.lenght = lenght;
    }
    @Override
    public String toString()
    {
        return  "Weight: " + weight + "kg, Height: " + height + "cm, Lenght: " + lenght + "cm";
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getLenght()
    {
        return lenght;
    }

    public void setLenght(int lenght)
    {
        this.lenght = lenght;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }
}
