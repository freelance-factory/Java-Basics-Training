package com.company.model;

/**
 * Created by leonardoriviere on 2/5/15.
 */
public class Fish implements IsAnimal {

    private Colour colour;

    public Fish(Colour colour) {
        this.colour = colour;
    }

    @Override
    public void born() {
        System.out.printf("I'm a fish and I'm " + colour);
    }

    public void talk() {
        System.out.println("-");
    }
}
