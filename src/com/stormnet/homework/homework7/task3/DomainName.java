package com.stormnet.homework.homework7.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomainName {
    public static void main(String[] args) {

        String text = "https://google.com";

        Pattern pattern = Pattern.compile("((http|https)://)?([\\w-]{2,63})\\.([a-z]{2,3})/?");
        Matcher matcher = pattern.matcher(text);

        boolean check = matcher.matches();

        if (check) {
            System.out.println("Верный формат: " + text.substring(matcher.start(), matcher.end()));
        } else {
            System.out.println("Неверный формат");
        }
    }
}
