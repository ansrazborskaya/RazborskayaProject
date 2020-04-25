package com.stormnet.homework.homework4.task1;

public class Mouse extends Animal {

    private String habitat;

    public Mouse(String name, String nutrition, String subspecies, String breed, String habitat) {
        super(name, nutrition, subspecies, breed);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void makeSound() {

        System.out.println("Mouse " + getName() + " says pi-pi-pi!");

    }

    @Override
    public void move() {
        System.out.println("Mouse runs away from a predator");

    }

    @Override
    public void eat(Animal animal) {

        System.out.println("This " + animal.getName() + " wants to eat me");

    }
}
