package com.company.model;

/**
 * Created by leonardoriviere on 2/5/15.
 */
public abstract class Animal {

    private Sex sex = Sex.MALE;
    private Food food;
    private int age;
    private int weight;

    public Animal(Sex sex, int age, int weight) {
        this.sex = sex;
        this.age = age;
        this.weight = weight;
    }

    public abstract void born();

    private static class Food {

        private String brand;

        public Food(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }
    }

}
