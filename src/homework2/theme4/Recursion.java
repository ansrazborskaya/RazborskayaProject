package homework2.theme4;

import javax.swing.*;
import java.util.Scanner;

public class Recursion {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number: ");
        int n = scanner.nextInt();

        if (recursion(n, 2)) {
            System.out.printf("«Is number %d simple - YES»", n);
        } else {
            System.out.printf("«Is number %d simple - NO»", n);
        }

    }


    public static boolean recursion(int n, int i) {
        if (n == 1) return false;
        if (n == 2) return true;

        if (n % i == 0) return false;

        if (i < n / 2)
            return recursion(n, i + 1);
        else return true;
    }


}
