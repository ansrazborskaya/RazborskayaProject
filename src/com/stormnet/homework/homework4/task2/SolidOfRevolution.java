package com.stormnet.homework.homework4.task2;

public class SolidOfRevolution extends Shape {

    private double radius;

    public SolidOfRevolution(double volume, String type, double radius) {
        super(volume,type);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
