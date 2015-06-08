package com.company.model;

/**
 * Created by leonardoriviere on 2/5/15.
 */
public class Cat extends Animal {

    private Colour colour;
    private Race race;

    public Cat(Sex sex, int age, int weight, Colour colour, Race race) {
        super(sex, age, weight);
        this.colour = colour;
        this.race = race;
        this.born(1980); // born();
    }

    @Override
    public void born() {
        // super.born(); // Invoco a born() de Animal
        // System.out.println("I'm a dog and I'm alive!");
        born(2015, 21);
    }

    protected void born(int year) {
        // super.born(); // Invoco a born() de Animal
        // System.out.println("I'm a dog and I'm alive!");
        born(year, 21);
    }

    public void born(int year, int century) {
        System.out.println("I'm a cat, It's " + year + " and I'm alive!");
        System.out.println("Century: " + century);
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
}
