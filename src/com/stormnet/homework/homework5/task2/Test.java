package com.stormnet.homework.homework5.task2;

public class Test {
    public static void main(String[] args) {

        for (Alphabet a : Alphabet.values()) {
            int result = a.getLetterPosition();
            System.out.println(a + " " + result);
        }
    }
}
