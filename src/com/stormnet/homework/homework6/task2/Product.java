package com.stormnet.homework.homework6.task2;

public class Product {

    private String typeOfProduct;
    private double price;

    public Product(String typeOfProduct, double price) {
        this.typeOfProduct = typeOfProduct;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
