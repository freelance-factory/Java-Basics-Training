package com.company.model;

/**
 * Model class for cars.
 */
public class Car {

    /**
     * Brand of the car.
     */
    public String brand;

    /**
     * Colour of the car.
     */
    public String colour;

    /**
     * Year of Car's Construction
     */
    public Integer year;

    /**
     * Default Constructor
     */
    public Car() {
        System.out.println("Now we're talking about cars!");
        brand = "N/A";
        colour = "N/A";
    }

    /**
     * Parametrized Constructor
     */
    public Car(String brand, String colour, Integer year) {
        this.brand = brand;
        this.colour = colour;
        this.year = year;
    }

    /**
     * This method makes a text of general information about the car.
     * This is the method that interacts with class' attributes.
     */
    public void information() {
        System.out.println(String.format("This car is a %d %s %s.",year,colour,brand));
    }

    /**
     * This method brings a mileage subjective valuation.
     * This method controls pre-conditions and shows errors.
     */
    public void historic(Integer mileage) {
        if (mileage < 0) {
            System.err.println("The mileage can't be negative. That would be crazy scientific shit.");
        } else if (mileage < 150000) {
            System.out.println("Wow! Your car is almost new! It has only "+ mileage + " miles.");
        } else if (mileage < 500000) {
            System.out.println("I think it would be nice to think about the chance of buying another one.");
        } else if (mileage > 500000) {
            System.err.println("There's no chance this car is still on the run.");
        }
    }

    /**
     * This method calculates the age of the car and prints it.
     * This is the method that handles parameters and gives a result back.
     */
    public Integer age(Integer currentyear) {
    System.out.println("And is " + (currentyear - year) + " year/s old.");
    return currentyear - year;
    }
}