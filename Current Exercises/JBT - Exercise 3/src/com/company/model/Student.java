package com.company.model;

public class Student extends Person {

    private String career;

    public Student(int dni, String name, String lastName, Sex sex, String career) {
        super(dni, name, lastName, sex);
        this.career = career;
    }

    public Student(int dni, String name, String lastName, Sex sex) {
        super(dni, name, lastName, sex);
    }

    @Override
    public String toString() {
        String a = "Student{"  + "dni=" + dni + ", name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", sex=" + sex + ", career='" + career + '\'' + '}';
        System.out.println(a);
        return a;
    }

    @Override
    public void details() {
        System.out.println("My name is " + name + " " + lastName + " and my career is " + career + ".");
    }

    @Override
    public void presentToPublic() {
        System.out.println("I am a " + sex + " student with DNI " + dni + ".");
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
