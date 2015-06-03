package com.company.model;

/**
 * Model class for dogs
 */
public class Dog {

    /**
     * Name of the dog
     */
    public String name;

    /**
     * Colour of the dog
     */
    public String colour;

    /**
     * Age of the dog
     */
    public int age;

    /**
     * Default constructor
     */
    public Dog() {
        System.out.println("Building a default dog!");
        name = "N/A";
        colour = "N/A";
    }

    /**
     * Parametrized constructor
     */
    public Dog(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    /**
     * The dog introduces himself to the public
     */
    public void describe() {
        System.out.println(String.format("My name is %s, I'm a %d year old %s dog", name, age, colour));
    }

    /**
     * This method prints what the dog says
     *
     * @author Leonardo Riviere
     */
    public void bark() {
        System.out.println("Guau! Guau!");
    }

    /**
     * The dog runs an amount of kilometers and prints each one in console
     *
     * @param km - the amount of kilometers that the dog will run
     * @return the amount of kilometers that the dog will run
     */
    public int run(int km) {

        // Checking illegal km values
        if (km == 0) {
            System.out.println("The dog is standing still. Give him some distance to run.");
            return -1;
        } else if (km > 10) {
            System.out.println("The dog can't run more than 10 km.");
            return -1;
        } else if (km < 0) {
            System.out.println("The dog doesn't know how to run backwards.");
            return -1;
        }

        // Printing the km the dog is at the moment
        for (int i = 0; i < km; i++) {
            System.out.println("Dog at km: " + (i + 1));
        }

        // Returning the total amount of km
        return km;
    }

}
