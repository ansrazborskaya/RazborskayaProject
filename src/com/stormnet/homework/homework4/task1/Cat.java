package com.stormnet.homework.homework4.task1;

public class Cat extends Animal {

    private boolean loveFish;

    public Cat(String name, String nutrition, String subspecies, String breed, boolean loveFish) {
        super(name, nutrition, subspecies, breed);
        this.loveFish = loveFish;
    }

    public boolean isLoveFish() {
        return loveFish;
    }

    public void setLoveFish(boolean loveFish) {
        this.loveFish = loveFish;
    }

    @Override
    public void makeSound() {

        System.out.println("Cat " + getName() + " says meow-meow!");

    }

    @Override
    public void move() {

        System.out.println("Cat " + getName() + " goes wherever he wants!");

    }

    @Override
    public void eat(Animal animal) {

        System.out.println("This " + animal.getName() + " wants to eat me");

    }

    public void eatSomebody(Animal animal) {

        System.out.println("Сat wants eat " + animal.getName());

    }

}
