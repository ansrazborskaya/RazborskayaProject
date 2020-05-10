package com.stormnet.homework.homework6.task4;


import java.util.*;

public class AutoShow {

    private LinkedList<Car> cars = new LinkedList<>();

    Scanner scanner;

    void addToCarList() throws InputMismatchException {

        String carMakeLocal;
        String carModelLocal;
        double priceLocal;

        scanner = new Scanner(System.in);

        System.out.println("Введите марку машины: ");
        carMakeLocal = scanner.nextLine();

        System.out.println("Введите модель машины: ");
        carModelLocal = scanner.nextLine();

        try {
            System.out.println("Введите цену: ");

            priceLocal = scanner.nextDouble();

            cars.add(new Car(priceLocal, carMakeLocal, carModelLocal));
            System.out.println("Машина успешно добавлена!");
        } catch (InputMismatchException e) {
            System.err.println("Введенное значение не соответствует типу double! Используйте цифры и запятую в качестве разделителя.");
        }
    }

    void getInfoSpecificCar() {

        scanner = new Scanner(System.in);
        boolean found = false;

        System.out.println("Введите интересующую вас марку машины: ");
        String specificCarMake = scanner.nextLine();

        System.out.println("Введите интересующую вас модель машины: ");
        String specificCarModel = scanner.nextLine();


        for (Car car : cars) {
            if (specificCarMake.equals(car.getCarMake()) && specificCarModel.equals(car.getCarModel())) {
                System.out.printf("Машина марки %s модели %s стоит %.2f долларов. Желаете приобрести?\n", car.getCarMake(), car.getCarModel(), car.getPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Нет подходящей для вас машины!");
        }
    }

    void getInfoAllCar() {
        boolean info = false;
        for (Car car : cars) {
            System.out.printf("Машина марки %s модели %s стоит %.2f долларов.\n", car.getCarMake(), car.getCarModel(), car.getPrice());
            info = true;
        }
        if (!info) {
            System.out.println("Нет машин на продажу!");
        }
    }

    void buyCar() {

        scanner = new Scanner(System.in);
        boolean foundForBuy = false;

        System.out.println("Введите марку машины, которую желаете купить: ");
        String buyCarMake = scanner.nextLine();

        System.out.println("Введите модель машины, которую желаете купить: ");
        String buyCarModel = scanner.nextLine();

        for (Car car : cars) {
            if (car.getCarMake().contains(buyCarMake) && car.getCarModel().contains(buyCarModel)) {
                System.out.printf("Машина продана, к оплате: %.2f\n", car.getPrice());

                cars.remove(car);
                foundForBuy = true;
            }
        }
        if (!foundForBuy) {
            System.out.println("К сожалению эта машина уже продана!");
        }
    }
}
