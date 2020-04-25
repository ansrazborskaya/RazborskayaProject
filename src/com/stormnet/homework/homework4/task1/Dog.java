package com.stormnet.homework.homework4.task1;

public class Dog extends Animal {

    private String favoriteToy;

    public Dog(String name, String nutrition, String subspecies, String breed, String favoriteToy) {
        super(name, nutrition, subspecies, breed);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + getName() + " says woof-woof!");
    }

    @Override
    public void move() {

        System.out.println("Dog runs after the tail");

    }

    @Override
    public void eat(Animal animal) {

        System.out.println("Dog wants to eat " + animal.getName());

    }
}
