package com.company;

/**
 * Created by Lill on 8/6/16.
 */
public class Conditioner {
    private String name;
    private double price;
    private boolean automatic;

    public Conditioner(String name, double price, boolean automatic)
    {
        this.name = name;
        this.price = price;
        this.automatic = automatic;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
     public  void raisePrice(int percent)
     {
         double raise = this.price*percent/100;
         this.price += raise;
     }
}
