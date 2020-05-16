package com.stormnet.homework.homework7.task1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReversLineOrder {
    public static void main(String[] args) {
        String[] text = null;

        try (FileReader fileReader = new FileReader("test2.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                text = str.split(" ");
            }

            int n = text.length;
            String temp;

            for (int i = 0; i < n/2; i++) {
                temp = text[n-i-1];
                text[n-i-1] = text[i];
                text[i] = temp;
            }

            for (String s : text) {
                System.out.print(s + " ");
            }

        } catch (IOException e) {
           System.err.print("Файл не найден!");
        }
    }
}
