package com.stormnet.homework.homework4.task2;

public class Pyramid extends Shape {

    private double baseArea;
    private double height;

    public Pyramid(double volume, String type, double baseArea, double height) {
        super(volume, type);
        this.baseArea = baseArea;
        this.height = height;
        this. volume = (double)1/3 * getBaseArea() * getHeight();

    }

    public double getBaseArea() {
        return baseArea;
    }

    public void setBaseArea(double baseArea) {
        this.baseArea = baseArea;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
