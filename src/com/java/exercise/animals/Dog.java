package com.java.exercise.animals;

import java.math.BigDecimal;

public class Dog extends AbstractAnimal {
    // Context: Attributes
    private String size;

    // Context: Methods
    // Context: Constructors
    public Dog() {
        super();
        this.size = "Medium";
    }

    public Dog(int age, BigDecimal weight, String species, String color, String habitat, String size) {
        super(age, weight, species, color, habitat);
        this.size = size;
    }

    // Context: Getters
    public String getSize() {
        return size;
    }

    // Context: Setters
    public void setSize(String size) {
        this.size = size;
    }

    // Context: Methods from AbstractAnimal
    @Override
    public void verso() {
        System.out.println("Bau, Bau, Bau...");
    }

    @Override
    public void mangia() {
        System.out.println("Sto mangiando carne");
    }

    // Context: Concrete Methods
    @Override
    public String toString() {
        return super.toString() +
                ", Taglia: " + this.size;
    }
}
