package com.java.exercise.animals;

import java.math.BigDecimal;

public abstract class AbstractAnimal {
    // Context: Attributes
    protected int age;
    protected BigDecimal weight;
    protected String species;
    protected String color;
    protected String habitat;

    // Context: Methods
    // Context: Constructors
    public AbstractAnimal() {
        this.age = 1;
        this.weight = BigDecimal.valueOf(0.1);
        this.species = "No species identified";
        this.color = "No Color identified";
        this.habitat = "No Habitat identified";
    }

    public AbstractAnimal(int age, BigDecimal weight, String species, String color, String habitat) {
        this.age = age;
        this.weight = weight;
        this.species = species;
        this.color = color;
        this.habitat = habitat;
    }

    // Context: Getters
    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getSpecies() {
        return species;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    // Context: Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    // Context: Concrete Methods
    // Explanation: This print "Zzz..." on the console
    public void dormi() {
        System.out.println("Zzz....");
    }

    @Override
    public String toString() {
        return "Informazioni sull'animale: \n" +
                "Età: " + this.age +
                ", Specie: " + this.species +
                ", Peso: " + this.weight +
                ", Colore: " + this.color +
                ", Habitat: " + this.habitat;
    }

    // Context: Abstract Methods
    // Explanation: This print the onomatopoeia of the animal's cry on the console
    public abstract void verso();

    // Explanation: This print the animal's favorite type of food
    public abstract void mangia();
}
