package com.company;

public abstract class Shape {


    public abstract double area();
    public abstract double perimeter();

    public static void main(String[] args)
    {
        //////////////////////// Testing the shapes /////////////////////

        /////////////////////// Testing Rectangle ///////////////////////
        double width = 4, length = 5;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length);
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
        System.out.println();

        /////////////////////// Testing Rectangle ///////////////////////
        double radius = 10;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Cirlce Perimeter: " + circle.perimeter());
        System.out.println();

        /////////////////////// Testing Triangle ///////////////////////
        double a = 2, b = 3, c = 4;
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c );
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        System.out.println();
    }
}
