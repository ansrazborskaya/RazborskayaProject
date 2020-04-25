package com.stormnet.homework.homework4.task2;

public class Test {
    public static void main(String[] args) {

        Ball ball = new Ball(0, "Ball", 5);
        Cylinder cylinder = new Cylinder(0, "Cylinder", 5, 5);
        Pyramid pyramid = new Pyramid(0, "Pyramid", 100, 120);
        Pyramid pyramid2 = new Pyramid(0, "Pyramid", 2000, 20);

        Box box = new Box(9000, "Box");

        box.addShape(ball);
        box.addShape(cylinder);
        box.addShape(pyramid);
        box.addShape(pyramid2);

    }
}
