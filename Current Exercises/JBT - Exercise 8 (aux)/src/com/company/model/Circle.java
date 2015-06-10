package com.company.model;

public class Circle implements GeometricObject{

    protected double radius = 1;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double a = 2 * Math.PI * radius;
        System.out.println("Perimeter: " + a);
        return a;
    }

    @Override
    public double getArea() {
        double a = Math.PI * Math.pow(radius,2);
        System.out.println("Area: " + a);
        return a;
    }
}
