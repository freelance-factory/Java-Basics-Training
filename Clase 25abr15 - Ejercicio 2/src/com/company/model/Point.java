package com.company.model;

/**
 * Model class for 2D space. points
 */
public class Point {

    /**
     * Attribute for first coordinate in space.
     */
    public int x;

    /**
     * Attribute for first coordinate in space.
     */
    public int y;

    /**
     * Method for printings first point's coordinates.
     */
    public void printcoordinates() {
        System.out.println("First point coordinates are (" + x + ";" + y + ").");
    }

    /**
     * Method for points sums.
     * @param a - It's the new x coordinate to sum.
     * @param b - It's the new y coordinate to sum.
     * @return The new coordinate in this format "(x;y)".
     */
    public String sum(Integer a, Integer b) {
        System.out.println("The new point is (" + (a + x) + ";" + (b + y) + ").");
        return "(" + ( a + x ) + ";" + ( b + y ) + ")";
    }
}
