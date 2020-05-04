package com.stormnet.homework.homework4.task2;

public class Ball extends SolidOfRevolution {

    public Ball(double volume, String type, double radius) {

        super(volume, type, radius);
        this.volume = (double)4/3 * Math.PI * Math.pow(getRadius(),3);
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
