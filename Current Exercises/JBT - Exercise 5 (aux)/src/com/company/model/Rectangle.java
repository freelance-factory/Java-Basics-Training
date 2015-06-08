package com.company.model;

public class Rectangle extends Shape{

    public double width;
    public double length;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }


    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
