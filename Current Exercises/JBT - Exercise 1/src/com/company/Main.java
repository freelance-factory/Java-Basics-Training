package com.company;

import com.company.model.Phone;

public class Main {

    public static void main(String[] args) {

        // First phone.

        Phone p1 = new Phone();
        p1.brand = "Samsung";
        p1.model = "Galaxy S4";
        p1.colour = "White";
        p1.year = 2012;

        // Running methods to know the information about the phone, its years old and its usage.

        p1.information();
        p1.yearsOld(2015);
        p1.usage(10);
    }
}
