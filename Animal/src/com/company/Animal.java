package com.company;

public abstract class Animal
{


    private boolean isAPet;
    private int yearsToLive;
    Size size;

    public Animal(boolean isAPet, int yearsToLive, Size size)
    {
        this.isAPet = isAPet;
        this.yearsToLive = yearsToLive;
        this.size = size;
    }
    public abstract void voice();

    @Override
    public String toString()
    {
        return "Animal  \nIs a pet: " + isAPet + "\nUsually dies at age: " + yearsToLive + "\nhas this size parameters: " + size;
    }

}
