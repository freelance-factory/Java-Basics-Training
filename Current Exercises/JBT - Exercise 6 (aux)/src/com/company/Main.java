package com.company;

import com.company.model.*;

public class Main {

    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting(); //Should result in printing "Meow!"
        Dog dog1 = new Dog();
        dog1.greeting(); //Should result in printing "Woof!"
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting(); //Should result in printing "Woow!"

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting(); //Should result in printing "Meow!"
        Animal animal2 = new Dog();
        animal2.greeting(); //Should result in printing "Woof!"
        Animal animal3 = new BigDog();
        animal3.greeting(); //Should result in printing "Woow!"
        // Animal animal4 = new Animal(); // An abstract class can't be instantiated.

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3; //This ought to be a BigDog, but given that BigDog extends from Dog, Saul Goodman.
        // Cat cat2 = (Cat)animal2; //This ought to be Dog.
        dog2.greeting(dog3); //This should return "Woooof!"
        dog3.greeting(dog2); //This should return "Woooof!" No, because even though we said that dog3 came from animal3 in class Dog, it was already a BigDog.
        dog2.greeting(bigDog2); //This should return "Woooof!"
        bigDog2.greeting(dog2); //This should return "Wooooow!"
        bigDog2.greeting(bigDog1); //This should return "Wooooow!"

    }
}
