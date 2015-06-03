package com.company;

import com.company.model.Car;

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
         * The first car in a list. It's a 1988 Red Mustang.
         */

        Car c1 = new Car();
        c1.brand = "Mustang";
        c1.colour = "Red";
        c1.year = 1988;

        /**
         * Telling the car information.
         */

        c1.information();
        c1.age(2015);
        c1.historic(10002000);
    }
}
