package com.stormnet.homework.homework7.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateTask {

    private static final String CHECK_DATA = "((19|2[0-9])[0-9]{2})/(0?[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])\\s" +
            "(0?[0-9]|[1][0-9]|[2][0-4]):(0[0-9]|[12345][0-9]):(0[0-9]|[12345][0-9])";
    private static String text;

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Введите дату в формате YYYY/MM/DD HH:MM:SS");
            text = bufferedReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        Pattern pattern = Pattern.compile(CHECK_DATA);
        Matcher matcher = pattern.matcher(text);
        boolean check = matcher.matches();

        if (check) {
            System.out.println("Дата соответсвует формату YYYY/MM/DD HH:MM:SS: " + text.substring(matcher.start(), matcher.end()));
        } else {
            System.out.println("Введенная дата не соответсвует формату YYYY/MM/DD HH:MM:SS");
        }
    }
}



