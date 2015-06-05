package com.company.model;

public class Cellphones extends SmallElectricalDevices {

    protected String networkCompatibility;

    public Cellphones(int productCode, double cost, double basePrice, String brand, String colour) {
        super( productCode, cost, basePrice, brand, colour);
    }

    public Cellphones(int productCode, double cost, double basePrice, String brand, String colour, String networkCompatibility) {
        super( productCode, cost, basePrice, brand, colour);
        this.networkCompatibility = networkCompatibility;
    }

    public void details() {
        super.details();
        System.out.println("Cellphones{" +
                "networkCompatibility=" + networkCompatibility +
                '}');
    }

    public void details(int x) {
        for (int i = 0; i < x ; i++) {
            super.details();
            System.out.println("Cellphones{" +
                    "networkCompatibility=" + networkCompatibility +
                    '}');
        }
    }

    public String getNetworkCompatibility() {
        return networkCompatibility;
    }

    public void setNetworkCompatibility(String networkCompatibility) {
        this.networkCompatibility = networkCompatibility;
    }
}
