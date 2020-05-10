package com.stormnet.homework.homework6.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    void start() throws InputMismatchException {

        AutoShow autoShow = new AutoShow();
        try {
            while (true) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("1 - добавить машину");
                System.out.println("2 - получить информацию по машине");
                System.out.println("3 - купить машину");
                System.out.println("4 - получить весь список машин");
                System.out.println("0 - выход");
                int operation = scanner.nextInt();

                if (operation == 0) {
                    break;
                }
                switch (operation) {
                    case 1:
                        autoShow.addToCarList();
                        break;
                    case 2:
                        autoShow.getInfoSpecificCar();
                        break;
                    case 3:
                        autoShow.buyCar();
                        break;
                    case 4:
                        autoShow.getInfoAllCar();
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Некорректный ввод");
        }
    }
}
