package com.stormnet.homework.homework5.task1;

public class Timer {

    EventHandler handler;

    Timer(EventHandler action) {

        this.handler = action;
    }

    public void printTime() {
        while (true) {
            try {
                Thread.sleep(10000);
                handler.execute();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
