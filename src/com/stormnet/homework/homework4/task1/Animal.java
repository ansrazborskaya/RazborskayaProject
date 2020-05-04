package com.stormnet.homework.homework4.task1;

public abstract class Animal implements Behavioral {

    protected String name;
    protected String nutrition;
    protected String subspecies;
    protected String breed;

    public Animal(String name, String nutrition, String subspecies, String breed) {
        this.name = name;
        this.nutrition = nutrition;
        this.subspecies = subspecies;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public abstract void makeSound();
}
