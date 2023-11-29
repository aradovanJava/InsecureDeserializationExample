package org.example.data;

import java.io.Serializable;

public class Animal implements Serializable {

    private static final long serialVersionUID = -1737174449603381165L;

    private String species;

    private String name;

    private Integer numberOfLegs;

    public Animal(String species, String name, Integer numberOfLegs) {
        this.species = species;
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}
