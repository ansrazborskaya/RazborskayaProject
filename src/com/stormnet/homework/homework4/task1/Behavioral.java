package com.stormnet.homework.homework4.task1;

public interface Behavioral {

    void move();

    default void beEaten(Animal animal) {
        System.out.println("This " + animal.getName() + " wants to eat me");
    }

    default void eatSomebody(Animal animal) {
        System.out.println("I want to eat " + animal.getName());
    }
}
