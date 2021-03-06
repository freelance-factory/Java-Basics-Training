package com.company.model;

public class Car extends Entity{

    public String brand;
    public String model;
    public int year;

    public Car(int id, String brand, String model, int year) {
        super(id);
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarDao{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", id=" + id +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
