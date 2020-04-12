package homework2.theme3;

import java.util.Random;
import java.util.Scanner;

public class TwoDimArray {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();


        
        int [][] twoDim = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                twoDim[i][j] = random.nextInt();

                if (twoDim[i][j] % 2 == 0) {

                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.print("\n");
        }


    }
    
}
