package com.company.model;

public class Television extends BigElectricalAppliances {

    protected String resolution;

    public Television(int productCode, double cost, double basePrice, String colour, double weight) {
        super(productCode, cost, basePrice, colour, weight);
    }

    public Television(int productCode, double cost, double basePrice, String colour, double weight, String resolution) {
        super(productCode, cost, basePrice, colour, weight);
        this.resolution = resolution;
    }

    public void details() {
        super.details();
        System.out.println("Television{" +
                "resolution='" + resolution + '\'' +
                '}');
    }

    public void details(int x) {
        for (int i = 0; i < x ; i++) {
            super.details();
            System.out.println("Television{" +
                    "resolution='" + resolution + '\'' +
                    '}');
        }
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
