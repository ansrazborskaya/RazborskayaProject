package homework2.theme1;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day from 1 to 9: ");
       int n = scanner.nextInt();

        switch (n) {
            case 1:
            case 8:
                System.out.println("Monday");
                break;
            case 2:
            case 9:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("The day doesn't meet the requirement n < 10!");


        }


    }


}
