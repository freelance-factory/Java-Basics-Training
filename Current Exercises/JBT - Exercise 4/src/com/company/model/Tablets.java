package com.company.model;

public class Tablets extends SmallElectricalDevices {

    protected Stylus stylus;

    public Tablets(int productCode, double cost, double basePrice, String brand, String colour) {
        super(productCode, cost, basePrice, brand, colour);
    }

    public Tablets(int productCode, double cost, double basePrice, String brand, String colour, Stylus stylus) {
        super(productCode, cost, basePrice, brand, colour);
        this.stylus = stylus;
    }

    public void details() {
        super.details();
        System.out.println("Tablets{" +
                "stylus=" + stylus +
                '}');
    }

    public void details(int x) {
        for (int i = 0; i < x ; i++) {
            super.details();
            System.out.println("Tablets{" +
                    "stylus=" + stylus +
                    '}');
        }
    }

    public Stylus getStylus() {
        return stylus;
    }

    public void setStylus(Stylus stylus) {
        this.stylus = stylus;
    }
}
