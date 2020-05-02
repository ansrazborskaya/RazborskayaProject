package com.stormnet.homework.homework4.task1;

public class Test {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", "omnivorous", "feline", "bengal cat", true);
        Dog dog = new Dog("Jack", "meat-eating", "canine", "German Shepherd", "ball");
        Mouse mouse = new Mouse("Minni", "herbivore", "rodent", "field mouse", "house");

      cat.eatSomebody(mouse);
      mouse.move();
      dog.eatSomebody(cat);
      cat.beEaten(dog);
      mouse.beEaten(dog);
      cat.makeSound();
    }
}
