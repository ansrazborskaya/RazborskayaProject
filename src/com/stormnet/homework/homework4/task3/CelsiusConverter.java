package com.stormnet.homework.homework4.task3;

import java.util.Scanner;

public class CelsiusConverter implements Converter {
    private double temperature;
    private char type;

    private void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperatures to convert to Celsius: ");
        temperature = scanner.nextDouble();

        System.out.println("Enter the temperature type in the following format: F or K");
        type = scanner.next().trim().charAt(0);
    }

    @Override
    public void convert() {

        input();

        if (type == 'F') {
            double resultConvert = (temperature - 32) / 1.8;
            System.out.println("Celsius temperature is " + resultConvert);
        }
        if (type == 'K') {
            double resultConvert = temperature - 273.15;
            System.out.println("Celsius temperature is " + resultConvert);
        } else if (type != 'F' && type != 'K') {
            System.out.println("You entered an invalid temperature type!");
        }
    }
}
