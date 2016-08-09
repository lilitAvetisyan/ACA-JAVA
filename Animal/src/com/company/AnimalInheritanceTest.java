package com.company;

/**
 * Created by Lill on 8/9/16.
 */
public class AnimalInheritanceTest
{
    public static void main(String[] args)
    {
        Size dogSize = new Size(15, 70, 70);
        Dog dog = new Dog(true, 10, dogSize,"Black", "Bark");

        Size lionSize = new Size(150, 150, 170);
        Lion lion = new Lion(false, 14, lionSize, "Brown", "Roar");

        Animal lionAnimal = lion;

        lion = (Lion)lionAnimal;

        Animal zoo[] = new Animal[2];
        zoo[0] = lion;
        zoo[1] = dog;

        for (Animal a: zoo)
        {
            System.out.println(a);
            a.voice();
        }


    }
}
