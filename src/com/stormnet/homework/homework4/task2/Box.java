package com.stormnet.homework.homework4.task2;

public class Box extends Shape {

    private double filledVolume;

    public Box(double volume, String type) {
        super(volume, type);
    }


    public void boxVolume(double volume) {

        volume = super.getVolume();

    }

    public boolean addShape(Shape shape) {

        boolean canAdd = true;

        if (this.volume >= (filledVolume + shape.getVolume())) {
            filledVolume += shape.getVolume();
            System.out.printf("Figure %s have been added \n", shape.getType());
            System.out.printf("Filled volume is %s \n", filledVolume);
        } else {
            System.out.printf("Can't add the figure %s  to the box \n", shape.getType());
            canAdd = false;
        }

        return canAdd;

    }

}
