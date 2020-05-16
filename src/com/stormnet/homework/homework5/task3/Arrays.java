package com.stormnet.homework.homework5.task3;


public class Arrays<T> {

    private T[] array;

    public Arrays(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Arrays{" +
                "array=" + java.util.Arrays.toString(array) +
                '}';
    }

    public void returnItem(int i) {

        System.out.println(array[i]);

    }
}
