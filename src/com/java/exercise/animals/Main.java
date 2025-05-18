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
        newDog.dormi();
        newDog.mangia();
        newDog.verso();

        // Context: invoke Methods of the emptyDog Object
        System.out.println(emptyDog);

        System.out.println("/--------------------------------------------------------------------/\n");
        /*
         * //DEBUG: Test of Sparrow instances and Abstract Methods inherited from
         * //DEBUG: AbstractAnimal
         */
        // Context: Instances of Sparrow Class
        Sparrow emptySparrow = new Sparrow();
        Sparrow newSparrow = new Sparrow(2, BigDecimal.valueOf(0.025), "Passer Italiae", "Giallo", "Ovunque", true);

        // Context: invoke Methods of the newSparrow Object
        System.out.println(newSparrow);
        newSparrow.dormi();
        newSparrow.mangia();
        newSparrow.verso();

        // Context: invoke Methods of the emptySparrow Object
        System.out.println(emptySparrow);

        System.out.println("/--------------------------------------------------------------------/\n");
        /*
         * //DEBUG: Test of Eagle instances and Abstract Methods inherited from
         * //DEBUG: AbstractAnimal
         */
        // Context: Instances of Eagle Class
        Eagle emptyEagle = new Eagle();
        Eagle newEagle = new Eagle(20, BigDecimal.valueOf(0.025), "Aquila Reale", "Marrone", "Zone Montuose",
                BigDecimal.valueOf(2.2));

        // Context: invoke Methods of the newEagle Object
        System.out.println(newEagle);
        newEagle.dormi();
        newEagle.mangia();
        newEagle.verso();

        // Context: invoke Methods of the emptyEagle Object
        System.out.println(emptyEagle);

        System.out.println("/--------------------------------------------------------------------/\n");
        /*
         * //DEBUG: Test of Dolphin instances and Abstract Methods inherited from
         * //DEBUG: AbstractAnimal
         */
        // Context: Instances of Dolphin Class
        Dolphin emptyDolphin = new Dolphin();
        Dolphin newDolphin = new Dolphin(15, BigDecimal.valueOf(0.025), "Delfino comune", "Blu", "Mare",
                BigDecimal.valueOf(6));

        // Context: invoke Methods of the newDolphin Object
        System.out.println(newDolphin);
        newDolphin.dormi();
        newDolphin.mangia();
        newDolphin.verso();

        // Context: invoke Methods of the emptyDolphin Object
        System.out.println(emptyDolphin);

        System.out.println("/--------------------------------------------------------------------/\n");
        faiVolare(newEagle);
        faiVolare(newSparrow);
        faiNuotare(newDolphin);
    }

    static void faiVolare(IFlying flyingAnimal) {
        flyingAnimal.Vola();
    }

    static void faiNuotare(ISwimming swimmingAnimal) {
        swimmingAnimal.Nuota();
    }
}
