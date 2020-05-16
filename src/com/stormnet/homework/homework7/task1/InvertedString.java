package com.stormnet.homework.homework7.task1;


import java.io.*;

public class InvertedString {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fos = new FileOutputStream("test.txt")) {

            System.out.println("Введите вашу строку: ");
            String string = new StringBuffer(br.readLine()).reverse().toString();

            byte[] buffer = string.getBytes();

            fos.write(buffer, 0, buffer.length);

            System.out.println("Файл записан!");

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
