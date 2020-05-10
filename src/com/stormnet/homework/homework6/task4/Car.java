package com.stormnet.homework.homework6.task4;

public class Car {
    private double price;
    private String carMake;
    private String carModel;

    public Car(double price, String carMake, String carModel) {
        this.price = price;
        this.carMake = carMake;
        this.carModel = carModel;
    }

    public double getPrice() {
        return price;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getCarModel() {
        return carModel;
    }
}
