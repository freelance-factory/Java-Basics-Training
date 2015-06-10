package com.company;

public class Main {

    public static void main(String[] args) {
    /*
        Animal dog = new Dog(Sex.MALE, 5, 10, Colour.BLACK, Race.BULL_DOG);
        Animal cat = new Cat(Sex.MALE, 4, 12, Colour.BROWN, Race.ROTTWEILER);

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        System.out.println("=====================");

        for (Animal animal : animals) {
            animal.born();
        }

        System.out.println("=====================");

        IsAnimal fish = new Fish(Colour.RED);
        fish.born();
        */

        try {
            a();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void a() throws Exception {
        System.err.println("--- A ---");
        try {
            b();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw e;
        }
        z();
    }

    public static void b() throws Exception {
        System.err.println("--- B ---");
        throwException();
        c();
    }

    public static void c() {
        System.err.println("--- C ---");
    }

    public static void z() {
        System.err.println("--- Z ---");
    }

    private static void throwException() throws Exception {
        throw new Exception("Explode");
    }

}
