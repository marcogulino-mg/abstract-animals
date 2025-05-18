package com.java.exercise.animals;

import java.math.BigDecimal;

public class Dolphin extends AbstractAnimal implements ISwimming {
    // Context: Attributes
    private BigDecimal breatherDiameter;

    // Context: Methods
    // Context: Constructors
    public Dolphin() {
        super();
        this.breatherDiameter = BigDecimal.valueOf(1);
    }

    public Dolphin(int age, BigDecimal weight, String species, String color, String habitat,
            BigDecimal breatherDiameter) {
        super(age, weight, species, color, habitat);
        this.breatherDiameter = breatherDiameter;
    }

    // Context: Getters
    public BigDecimal getBreatherDiameter() {
        return breatherDiameter;
    }

    // Context: Setters
    public void setBreatherDiameter(BigDecimal breatherDiameter) {
        this.breatherDiameter = breatherDiameter;
    }

    // Context: Methods from AbstractAnimal
    @Override
    public void verso() {
        System.out.println("Iiik, iiik...");
    }

    @Override
    public void mangia() {
        System.out.println("Sto mangiando pesce");
    }

    // Context: Methods from ISwimming
    @Override
    public void Nuota() {
        System.out.println("Sto nuotando!!!");
    }

    // Context: Concrete Methods
    @Override
    public String toString() {
        return super.toString() +
                ", Diametro Sfiatatoio: " + this.breatherDiameter + "cm";
    }
}
