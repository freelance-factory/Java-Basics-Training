package com.company.model;

/**
 * Created by leonardoriviere on 8/5/15.
 */
public class Person {

    public Integer dni;

    public String name;

    public String lastname;

    public Sex sex = Sex.MALE;

    public Person(Integer dni, String name, String lastname, Sex sex) {
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.sex = sex;
    }

    public void presentToPublic() {
        System.out.println("I am a " + sex + " student/professor with DNI: " + dni);
    }

    public void showFullName() {
        System.out.println("I'm "+ name + " " + lastname + ".");
    }

    public void details() {

    }
}
