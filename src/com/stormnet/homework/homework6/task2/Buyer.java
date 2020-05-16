package com.stormnet.homework.homework6.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Buyer implements Comparable<Buyer>{

    private ArrayList<Product> shoppingList = new ArrayList<>();

    public ArrayList<Product> getShoppingList() {
        return shoppingList;
    }

    void addToShoppingList() {

        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите название товара: ");
            String typeOfProduct = scanner.nextLine();

            if (typeOfProduct.equals("exit")) {
                break;
            }

            System.out.println("Введите цену: ");
            double price = scanner.nextDouble();

            shoppingList.add(new Product(typeOfProduct, price));
        }
    }

    @Override
    public int compareTo(Buyer buyer) {
        return 0;
    }
}
