package com.company;

import com.company.model.*;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student(34214214, "Martín", "Perez", Sex.MALE);

        s1.setCareer("Computers Engineering");

        Professor p1 = new Professor(23452120, "Romina", "Gaetani", Sex.FEMALE);

        p1.setSpecialty("Arts");

        Student s2 = new Student(30234123, "Juan", "Perez", Sex.MALE, "Economics");
        Professor p2 = new Professor(20254324, "Roberto", "Lupe", Sex.MALE, "Mathematics");

        System.out.println("== DETAILS ==");
        s1.details();
        s2.details();
        p1.details();
        p2.details();

        System.out.println("\n == PRESENTATIONS ==");
        s1.presentToPublic();
        s2.presentToPublic();
        p1.presentToPublic();
        p2.presentToPublic();

        System.out.println("\n== toString() ==");
        s1.toString();
        s2.toString();
        p1.toString();
        p2.toString();
    }
}


