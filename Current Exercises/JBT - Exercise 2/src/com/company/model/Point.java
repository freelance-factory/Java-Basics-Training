package com.company.model;

/**
 * Created by leonardoriviere on 6/4/15.
 */
public class Point {
    public int x;
    public int y;

    public String pointCoordinates() {
        String pointCoordinates = "(" + x + ";" + y + ")";
        System.out.println("Your point coordinates are " + pointCoordinates);
        return pointCoordinates;
    }

    public String pointSum(int a, int b) {
        System.out.println("You're summing the point ("+ a + ";" + b + ") to your original point (" + x + ";" + y + ")." );
        int c = x + a;
        int d = y + b;
        String pointSum = "(" + c + ";" + d + ")";
        System.out.println("The resulting point is " + pointSum);
        return pointSum;
    }

}