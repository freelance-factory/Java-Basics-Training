package com.company;

import com.company.model.*;

public class Main {

    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);                    // which version?
        System.out.println("Area: " + s1.getArea());          // which version?
        System.out.println("Perimeter: " + s1.getPerimeter());     // which version?
        System.out.println("Color: " + s1.getColor());
        System.out.println("Filled: " + s1.isFilled());
        // System.out.println(s1.getRadius()); //GetRadius method is not defined in Shape.

        System.out.println("---------------------");

        Circle c1 = (Circle) s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Filled: " + c1.isFilled());
        System.out.println("Radius: " + c1.getRadius());

        // Shape s2 = new Shape(); //An abstract class can't be instantiated.
        System.out.println("---------------------");

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
        System.out.println(s3);
        System.out.println("Area: " + s3.getArea());
        System.out.println("Perimeter: " + s3.getPerimeter());
        System.out.println("Color: " + s3.getColor());
        // System.out.println(s3.getLength()); //GetLength method is not defined in Shape.

        System.out.println("---------------------");

        Rectangle r1 = (Rectangle) s3;   // downcast
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Color: " + r1.getColor());
        System.out.println("Length: " + r1.getLength());

        System.out.println("---------------------");

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println("Area: " + s4.getArea());
        System.out.println("Color: " + s4.getColor());
        //System.out.println(s4.getSide()); //getSide method is not defined in Shape.

        System.out.println("---------------------");

// Take note that we downcast Shape s4 to Rectangle,
//  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Color: " + r2.getColor());
        // System.out.println(r2.getSide()); //getSide method is not defined in Shape.
        System.out.println("Length: " + r2.getLength());

        System.out.println("---------------------");

// Downcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Color: " + sq1.getColor());
        System.out.println("Side: " + sq1.getSide());
        System.out.println("Length: " + sq1.getLength());

    }
}
