package com.company.model;

/**
 * Created by leonardoriviere on 6/4/15.
 */
public class Phone {

    /**
     * Brand of the mobile device.
     */
    public String brand;

    /**
     * Model of the mobile device.
     */
    public String model;

    /**
     * Colour of the mobile device.
     */
    public String colour;

    /**
     * Year of the mobile device.
     */
    public Integer year;

    /**
     * Default Constructor.
     */
    public Phone() {
    }

    /**
     * Parametrized Constructor.
     */
    public Phone(String brand, String model, String colour, Integer year) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    /**
     * Method that receives your usage and returns if your phone should buy (or not) a new phone.
     */
    public void usage(Integer monthsOfUse) {
        if (monthsOfUse < 0) {
            System.err.println("Time can't be negative. Don't be an a-hole.");
        } else if (monthsOfUse < 4) {
            System.out.println("Your phone is brand new. You should keep it.");
        } else if (monthsOfUse < 8) {
            System.out.println("Mmm...Your phone's getting old.");
        } else {
            System.out.println("You should definitely change your phone. Come on, man.");
        }
    }

    /**
     * Method that tells the age of your phone.
     */
    public Integer yearsOld(Integer currentYear) {
        Integer yearsOld = currentYear - year;
        System.out.println("Your phone is "+ yearsOld + " years old");
        return yearsOld;
    }

    /**
     * Method that shows information about your phone.
     */
    public void information() {
        System.out.println("You have a "+year+" "+colour+" "+brand+" "+model+".");
    }

}
