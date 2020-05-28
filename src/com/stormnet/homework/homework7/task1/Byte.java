package com.stormnet.homework.homework7.task1;

import java.io.*;

public class Byte {
    public static void main(String[] args) {

        System.out.println("Введите название вашего файла: ");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(br.readLine())) {

            int maxByte = fis.read();
            int minByte = fis.read();

            while (fis.available() > 0) {

                int value = fis.read();

                if (value > maxByte) {
                    maxByte = value;
                }
                if (value < minByte) {
                    minByte = value;
                }
            }

            System.out.printf("Значение максимального байта равно %d.\n", maxByte);
            System.out.printf("Значение минимального байта равно %d.\n", minByte);

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
