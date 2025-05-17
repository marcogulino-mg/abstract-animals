package com.java.exercise.animals;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*
         * //DEBUG: Test of Dog instances and Abstract Methods inherited from
         * //DEBUG: AbstractAnimal
         */
        // Context: Instances of Dog Class
        Dog emptyDog = new Dog();
        Dog newDog = new Dog(5, BigDecimal.valueOf(30.40), "Pastore Tedesco", "Marrone", "Urbano", "Large");

        // Context: invoke Methods of the newDog Object
        System.out.println(newDog);
        newDog.mangia();
        newDog.verso();

        // Context: invoke Methods of the emptyDog Object
        System.out.println(emptyDog);
    }
}
