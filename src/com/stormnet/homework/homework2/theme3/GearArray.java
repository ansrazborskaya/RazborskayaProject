package com.stormnet.homework.homework2.theme3;

import java.util.Random;

public class GearArray {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] gearArray = new int[10][];
        int num;

        for (int i = 0; i < gearArray.length; i++) {

            int size = 1 + (int) (Math.random() * 10);
            gearArray[i] = new int[size];
        }

        for (int i = 0; i < gearArray.length; i++) {
            for (int j = 0; j < gearArray[i].length; j++) {
                num = random.nextInt(5);
                gearArray[i][j] = num;
            }

        }

        for (int i = 0; i < gearArray.length; i++) {
            for (int j = 0; j < gearArray[i].length; j++) {
                System.out.print(gearArray[i][j] + " ");
            }
            System.out.println();

        }

    }

}



