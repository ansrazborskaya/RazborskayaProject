package homework2.theme1;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        start();

    }

    public static void start() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter the radius r: ");
        double r = scanner.nextDouble();

        double rectangleArea = a * b;
        double circleArea = Math.PI * r * r;


        if (rectangleArea < circleArea) {

            System.out.printf("The area of the circle - %f is larger than the area of the rectangle - %f. \n" +
                    "You can close the hole!", circleArea, rectangleArea);
        } else {

            System.out.printf("The area of the circle - %f is less than the area of the rectangle - %f. \n" +
                    "You cannot close the hole!", circleArea, rectangleArea);
        }

    }


}
