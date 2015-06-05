package com.company.model;

public class Person {

    protected int dni;
    protected String name;
    protected String lastName;
    protected Sex sex;

    public Person(int dni, String name, String lastName, Sex sex) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
    }

    protected void presentToPublic() {

        System.out.println("I am a " + sex + " person with DNI: "+ dni + ".");

    }

    protected void showFullName() {
        System.out.println("My name is " + name + " " + lastName + ".");
    }

    protected void details() {

        System.out.println("My name is " + name + " " + lastName + ", I am a " + sex + " and my DNI number is " + dni +".");

    }

    @Override
    public String toString() {
        String a = "Person{" + "dni=" + dni + ", name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", sex=" + sex + '}';
        System.out.println(a);
        return a;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
