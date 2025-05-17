package com.java.exercise.animals;

import java.math.BigDecimal;

public class Sparrow extends AbstractAnimal {
    // Context: Attributes
    private boolean isSinger;

    // Context: Methods
    // Context: Constructors
    public Sparrow() {
        super();
        this.isSinger = false;
    }

    public Sparrow(int age, BigDecimal weight, String species, String color, String habitat, boolean isSinger) {
        super(age, weight, species, color, habitat);
        this.isSinger = isSinger;
    }

    // Context: Getters
    public boolean isSinger() {
        return isSinger;
    }

    // Context: Setters
    public void setSinger(boolean isSinger) {
        this.isSinger = isSinger;
    }

    // Context: Methods from AbstractAnimal
    @Override
    public void verso() {
        System.out.println("Cip, Cip, Cip...");
    }

    @Override
    public void mangia() {
        System.out.println("Sto mangiando semi");
    }

    // Context: Concrete Methods
    @Override
    public String toString() {
        return super.toString() +
                ", Sa cantare?: " + this.isSinger;
    }
}
