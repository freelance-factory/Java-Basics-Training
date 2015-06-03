package com.company.model;

/**
 * Created by leonardoriviere on 8/5/15.
 */
public class Professor extends Person {

    public String speciality;

    public Professor(Sex sex, String name, String lastname, Integer dni) {
        super(sex, name, lastname, dni);
    }
}
