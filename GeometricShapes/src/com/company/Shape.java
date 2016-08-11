package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Shape implements Comparable<Shape>
{


    public abstract double area();
    public abstract double perimeter();


    public static void main(String[] args)
    {

        ///////////////////////  Rectangle ///////////////////////
        double width = 4, length = 5;
        Shape rectangle = new Rectangle(width, length);
        Shape anotherRectangle = new Rectangle(5,6);
        System.out.println("Rectangle width: " + width + " and length: " + length);
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
        System.out.println("Does this rectangle has bigger area than anotherRectangle: " + rectangle.compareTo(anotherRectangle));
        System.out.println();

        ///////////////////////  Circle ///////////////////////
        double radius = 10;
        Shape circle = new Circle(radius);
        Shape anotherCircle = new Circle(10);
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Does this Circle has bigger area than anotherCircle: " + circle.compareTo(anotherCircle));
        System.out.println();

        ///////////////////////  Triangle ///////////////////////
        double a = 2, b = 3, c = 4;
        Shape triangle = new Triangle(a,b,c);
        Shape anotherTriangle = new Triangle(2,2,3);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c );
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        System.out.println("Does this triangle has bigger area than anotherTriangle: " + triangle.compareTo(anotherTriangle));
        System.out.println();

        ////////////////////// Creating the list/array of shapes and sorting it///
        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);
        shapes.add(triangle);
        Collections.sort(shapes);
        Collections.reverse(shapes);
        System.out.println("Here are the shape areas in acceding order:");
        for(Shape s : shapes)
            System.out.println(s.area());

    }

}
