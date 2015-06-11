package com.company.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyClass {

    public void myMethod() {

        File file = new File("filename.txt");

        try {
            String a = "";
            System.out.println("Cadena: " + a.toString());
        } catch (Exception e) {
            System.out.println("Another exception");
        } finally {
            System.out.println("Finally");
        }


        try {
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println("Fallo");
        }

    }

    public int sum(int a, int b) {
        return a + b;
    }
}
