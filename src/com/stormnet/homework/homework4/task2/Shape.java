package com.stormnet.homework.homework4.task2;

public abstract class Shape {

     protected double volume;
     protected String type;

    public Shape(double volume, String type) {
        this.volume = volume;
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public String getType() {
        return type;
    }
}
