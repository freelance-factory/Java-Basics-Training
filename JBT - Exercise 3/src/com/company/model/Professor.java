package com.company.model;

public class Professor extends Person {

    private String specialty;

    public Professor(int dni, String name, String lastName, Sex sex, String speciality) {
        super(dni, name, lastName, sex);
        this.specialty = speciality;
    }

    public Professor(int dni, String name, String lastName, Sex sex){
        super(dni, name, lastName, sex);
    }

    @Override
    public String toString() {
        String a = "Professor{"  + "dni=" + dni + ", name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", sex=" + sex + ", speciality='" + specialty + '\'' + '}';
        System.out.println(a);
        return a;
    }

    @Override
    public void details() {
        System.out.println("My name is " + name + " " + lastName + " and my career is " + specialty + ".");
    }

    @Override
    public void presentToPublic() {
        System.out.println("I am a " + sex + " professor with DNI " + dni + ".");
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String speciality) {
        this.specialty = speciality;
    }
}
