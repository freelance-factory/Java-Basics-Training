package com.company;

import com.company.model.Dog;

/**
 * Main class of our program
 */
public class Main {

    /**
     * Main method of our program. This is the entry point.
     * @param args - program's arguments
     */
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Firulais";
        d1.colour = "Black";
        d1.age = 5;

        //d1.describe();
        //d1.bark();
        d1.run(10);

        Dog d2 = new Dog("Larry", "Brown", 8);

    }
}
