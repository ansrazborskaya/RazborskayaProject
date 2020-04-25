package com.stormnet.homework.homework4.task1;

public class Test {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", "omnivorous", "feline", "bengal cat", true);
        Dog dog = new Dog("Jack", "meat-eating", "canine", "German Shepherd", "ball");
        Mouse mouse = new Mouse("Minni", "herbivore", "rodent", "field mouse", "house");

        dog.eat(mouse);
        mouse.move();
        cat.eatSomebody(mouse);
        mouse.eat(cat);
        dog.makeSound();
        cat.eat(dog);

    }
}
