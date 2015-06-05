package com.company.model;

public class WasherMachine extends BigElectricalAppliances {

    protected int load;

    public WasherMachine( int productCode, double cost, double basePrice, String colour, double weight) {
        super(productCode, cost, basePrice, colour, weight);
    }

    public WasherMachine( int productCode, double cost, double basePrice, String colour, double weight, int load) {
        super(productCode, cost, basePrice, colour, weight);
        this.load = load;
    }

    public void details() {
        super.details();
        System.out.println("WasherMachine{" +
                "load=" + load +
                '}');
    }

    public void details(int x) {
        for (int i = 0; i < x ; i++) {
            super.details();
            System.out.println("WasherMachine{" +
                    "load=" + load +
                    '}');
        }
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
}
