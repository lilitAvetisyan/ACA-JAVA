package com.company;

public class Main {

    public static void main(String[] args)
    {
        Conditioner airConditioner1 = new Conditioner("Admiral", 200, true);
        Conditioner airConditioner2 = new Conditioner("Breeze Air", 250, false);

        System.out.println("The price for " + airConditioner1.getName() + "is: " + airConditioner1.getPrice());
        System.out.println("The price for " + airConditioner2.getName() + "is: " + airConditioner2.getPrice());
        System.out.println();

        Conditioner [] inventory = new Conditioner[3];
        inventory[0] = new Conditioner("Admiral", 200, true);
        inventory[1] = new Conditioner("Breeze Air", 250, false);
        inventory[2] = new Conditioner("Turbo Air", 50, true);

        for(Conditioner c: inventory)
        {
            c.raisePrice(10);
        }

        for(Conditioner c : inventory)
        {
            System.out.println("The price for " + c.getName() + "is: " + c.getPrice());
        }

    }
}
