package com.stormnet.homework.homework4.task3;

import java.util.Scanner;

public class FahrenheitConverter implements Converter {

    private double temperature;
    private char type;

    private void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperatures to convert to Fahrenheit: ");
        temperature = scanner.nextDouble();

        System.out.println("Enter the temperature type in the following format: C or K");
        type = scanner.next().trim().charAt(0);
    }

    @Override
    public void convert() {

        input();

        if (type == 'C') {
            double resultConvert = temperature * 1.8 + 32;
            System.out.println("Fahrenheit temperature is " + resultConvert);
        }
        if (type == 'K') {
            double resultConvert = 1.8 * (temperature - 273) + 32;
            System.out.println("Fahrenheit temperature is " + resultConvert);
        } else if (type != 'C' && type != 'K') {
            System.out.println("You entered an invalid temperature type!");
        }
    }
}
