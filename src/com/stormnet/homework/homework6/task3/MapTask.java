package com.stormnet.homework.homework6.task3;

import java.util.*;

public class MapTask {
    private Map<Integer, String> map = new HashMap<>();

    private void addToMap() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите ключ: ");
            int key = sc.nextInt();

            System.out.println("Введите значение: ");
            String value = sc.next();

            if (value.equals("exit")) {
                break;
            }
            map.put(key, value);
        }
    }

    void outputKeyAndValue() {

        addToMap();

        Set<Integer> keys = new HashSet<>(map.keySet());
        for (int i : keys) {
            System.out.println("Ключ: " + i);
        }

        List<String> values = new ArrayList<>(map.values());
        for (String j : values) {
            System.out.println("Значение: " + j);
        }
    }
}
