package com.company.model;

public class BigElectricalAppliances {

    private int productCode;
    private double cost;
    protected double basePrice;
    protected String colour;
    public double weight;

    protected BigElectricalAppliances(int productCode, double cost, double basePrice, String colour, double weight) {
        this.productCode = productCode;
        this.cost = cost;
        this.basePrice = basePrice;
        this.colour = colour;
        this.weight = weight;
    }

    protected void details() {
        System.out.println("BigElectricalAppliances{" +
                "productCode=" + productCode +
                ", cost=" + cost +
                ", basePrice=" + basePrice +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                '}');
    }

    protected void details(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("BigElectricalAppliances{" +
                    "productCode=" + productCode +
                    ", cost=" + cost +
                    ", basePrice=" + basePrice +
                    ", colour='" + colour + '\'' +
                    ", weight=" + weight +
                    '}');
        }
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

