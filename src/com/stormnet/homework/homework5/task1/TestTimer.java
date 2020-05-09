package com.stormnet.homework.homework5.task1;

public class TestTimer {
    public static void main(String[] args) {
        Timer timer = new Timer(new TimerHandler());
        timer.printTime();
    }
}
