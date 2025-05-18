package com.java.exercise.animals;

import java.math.BigDecimal;

public class Eagle extends AbstractAnimal implements IFlying {
    // Context: Attributes
    private BigDecimal wingSpan;

    // Context: Methods
    // Context: Constructors
    public Eagle() {
        super();
        this.wingSpan = BigDecimal.valueOf(1);
    }

    public Eagle(int age, BigDecimal weight, String species, String color, String habitat, BigDecimal wingSpan) {
        super(age, weight, species, color, habitat);
        this.wingSpan = wingSpan;
    }

    // Context: Getters
    public BigDecimal getWingSpan() {
        return wingSpan;
    }

    // Context: Setters
    public void setWingSpan(BigDecimal wingSpan) {
        this.wingSpan = wingSpan;
    }

    // Context: Methods from AbstractAnimal
    @Override
    public void verso() {
        System.out.println("Screech...");
    }

    @Override
    public void mangia() {
        System.out.println("Sto mangiando carne");
    }

    // Context: Methods from IFlying
    @Override
    public void Vola() {
        System.out.println("Sto volando!!!");
    }

    // Context: Concrete Methods
    @Override
    public String toString() {
        return super.toString() +
                ", Apertura Alare: " + this.wingSpan + "m";
    }
}
