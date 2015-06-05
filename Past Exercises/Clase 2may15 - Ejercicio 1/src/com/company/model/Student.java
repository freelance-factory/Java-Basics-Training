package com.company.model;

/**
 * Created by leonardoriviere on 8/5/15.
 */
public class Student extends Person {

    public String career;
    
    public Student(Sex sex, String name, String lastname, Integer dni) {
        super(sex, name, lastname, dni);
    }
}
