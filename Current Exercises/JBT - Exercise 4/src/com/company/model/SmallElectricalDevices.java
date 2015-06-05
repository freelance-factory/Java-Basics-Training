package com.company.model;

public class SmallElectricalDevices {

    private int productCode;
    private double cost;
    protected double basePrice;
    protected String brand;
    public String colour;

    public SmallElectricalDevices(int productCode, double cost, double basePrice, String brand, String colour){
        this.productCode = productCode;
        this.cost = cost;
        this.basePrice = basePrice;
        this.brand = brand;
        this.colour = colour;
    }

    public void details() {
        System.out.println("SmallElectricalDevices{" +
                "productCode=" + productCode +
                ", cost=" + cost +
                ", basePrice=" + basePrice +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                '}');
    }

    public void details(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("SmallElectricalDevices{" +
                    "productCode=" + productCode +
                    ", cost=" + cost +
                    ", basePrice=" + basePrice +
                    ", brand='" + brand + '\'' +
                    ", colour='" + colour + '\'' +
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
