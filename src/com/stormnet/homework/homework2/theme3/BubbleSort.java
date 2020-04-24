package com.stormnet.homework.homework2.theme3;

import java.util.Arrays;

public class BubbleSort {

    private static int[] number = {4, 52, 21, -2, 32, 4, 88, 1, -22, 150, 78, 14};

    public static void main(String[] args) {

        sortBubble(number);
        System.out.println("This is a sorted array: " + Arrays.toString(number));

    }


    public static void sortBubble(int[] number) {
        boolean sort = false;
        int tmp;

        while (!sort) {

            sort = true;
            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] > number[i + 1]) {
                    sort = false;
                    tmp = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = tmp;

                }

            }

        }

    }


}
