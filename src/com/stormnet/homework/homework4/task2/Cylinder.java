package com.stormnet.homework.homework4.task2;

public class Cylinder extends SolidOfRevolution {

    private double height;

    public Cylinder(double volume, String type, double radius, double height) {
        super(volume, type, radius);
        this.height = height;
        this.volume = Math.PI * Math.pow(getRadius(),2) * getHeight();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
