package com.company.model;

/**
 * Created by leonardoriviere on 2/5/15.
 */
public class Animal {

    private Sex sex = Sex.MALE;
    private int age;
    private int weight;

    public Animal() {
    }

    public Animal(Sex sex, int age, int weight) {
        this.sex = sex;
        this.age = age;
        this.weight = weight;
    }

    protected void born() {
        System.out.println("I'm an animal, and I'm alive!");
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
