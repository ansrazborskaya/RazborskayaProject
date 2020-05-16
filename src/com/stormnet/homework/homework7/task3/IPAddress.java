package com.stormnet.homework.homework7.task3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddress {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("127.0.0.1");
        strings.add("255.255.255.0");
        strings.add("abc.def.gha.bcd");
        strings.add("158.200.235.9");
        strings.add("1300.6.7.8");

        Pattern pattern = Pattern.compile("\\b(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})\\b");

        for (String string : strings) {
            Matcher matcher = pattern.matcher(string);
            boolean check = matcher.matches();

            if (check) {
                System.out.println("Верный формат IP: " + string.substring(matcher.start(), matcher.end()));
            } else {
                System.out.println("Неверный формат IP: " + string);
            }
        }
    }
}
