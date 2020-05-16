package com.stormnet.homework.homework6.task2;

import java.util.*;

public class Cashbox {

    private PriorityQueue<Buyer> turnCashbox = new PriorityQueue<>();
    private double cassSum = 0;

    void addBuyerToQuery(Buyer buyer) {
        turnCashbox.add(buyer);
    }

    boolean isQueueIsEmpty() {
        return turnCashbox.isEmpty();
    }

    void calculateNextBuyer() {
        Buyer buyer;
        double sum;

        buyer = turnCashbox.peek();

        sum = this.calculatePrice(buyer);
        cassSum += sum;
        turnCashbox.remove();

        System.out.println("Сумма товаров равна: " + sum + "\nПокупатель рассчитан!");
    }

    private double calculatePrice(Buyer buyer) {
        ArrayList<Product> shoppingList;

        double sum = 0;

        shoppingList = buyer.getShoppingList();

        for (Product product : shoppingList) {

            sum += product.getPrice();
        }
        return sum;
    }
}
