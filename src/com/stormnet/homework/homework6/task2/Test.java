package com.stormnet.homework.homework6.task2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Cashbox cashbox = new Cashbox();
        Buyer buyer;

        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("1 - добавить покупателя");
            System.out.println("2 - рассчитать всю очередь");
            System.out.println("0 - выход");
            int operation = scanner.nextInt();

            if (operation == 0) {
                break;
            } else if (operation == 1) {
                buyer = new Buyer();
                buyer.addToShoppingList();

                cashbox.addBuyerToQuery(buyer);
            } else if (operation == 2) {
                if (cashbox.isQueueIsEmpty()) {
                    System.out.println("В очереди нет покупателей!");
                }
                else {
                    while (!cashbox.isQueueIsEmpty()) {
                        cashbox.calculateNextBuyer();
                    }
                }
            }
        }
    }
}
