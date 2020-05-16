package com.stormnet.homework.homework6.task1;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BotanyMap {

    private Map<String, String> plants = new HashMap<>();

    void addToMap() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Введите название растения: ");
            String name = scanner.nextLine();

            if (name.equals("exit")) {
                break;
            }

            System.out.println("Введите тип растения: ");
            String type = scanner.nextLine();

            plants.put(name, type);

        }
    }

    void getAllPlants() {
        for (Map.Entry<String, String> plant : plants.entrySet()) {
            System.out.println(plant.getKey() + " " + plant.getValue());
        }
    }

    void getPlant(String type) {

        boolean found = false;

        for (Map.Entry<String, String> plant : plants.entrySet()) {

            if (type.equals(plant.getValue())) {
                System.out.printf("В справочнике найдены следующие значения: %s - это %s \n", plant.getKey(), plant.getValue());
                found = true;
            }
        }

        if (found == false) {
            System.out.println("Тип не найден");
        }
    }
}
