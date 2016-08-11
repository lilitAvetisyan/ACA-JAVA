package com.company;

/**
 * Created by Lill on 8/5/16.
 */
public class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
        // P = 2πr
        return 2 * pi * radius;
    }

    @Override
    public int compareTo(Shape o)
    {
        if (o.area() == area())
            return 0;
        else if (o.area() > area())
            return 1;
        else
            return -1;
    }
}
