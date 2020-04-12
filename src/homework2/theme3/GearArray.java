package homework2.theme3;


import java.util.Random;

public class GearArray {

    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(58);




        int[][] gearArray = new int[10][n];

        for (int i = 0; i < gearArray.length; i++) {
            for (int j = 0; j < n; j++) {

                gearArray[i][j] = random.nextInt(22);
                System.out.print(gearArray[i][j] + " ");
            }
            System.out.println();
        }



    }


}
