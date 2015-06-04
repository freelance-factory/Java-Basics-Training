package com.company;

import com.company.model.Point;

/**
 * Main Class of our program
 */
public class Main {

    /**
     * Main method of our program. This is the entry point.
     * @param args - program's arguments
     */
    public static void main(String[] args) {

        /**
         * First Point Coordinates.
         */
        Point p1 = new Point();
        p1.x = 2;
        p1.y = 4;

        /**
         * Printing First Point Coordinates.
         */
        p1.printcoordinates();

        /**
         * Doing a sum with another point.
         */
        p1.sum(4,5);
    }
}
