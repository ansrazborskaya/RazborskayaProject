package homework2.theme3;

import java.util.Arrays;

public class VectorTask {

    private static double [] array = {-10.5, -1, 0, 8.75, 11, -15 };
    private static double sum = 0;
    private static double multiplyRes = 1;
    private static double max = 0;
    private static double min = 0;

    public static void main(String[] args) {

        findSum(array);
        multiplyElements(array);


    }

    public static void findSum(double[] array){
        for (int i = 0; i < array.length; i++){

            double j = array[i];
            if (j < 0) {
                sum = sum + j;
            }
        }
        System.out.println( "The sum of the negative elements of the array is " + sum);


    }


    public static void multiplyElements (double[] array){

        Arrays.sort(array);
        max = array[array.length - 1];
        min = array[0];


            for (int i = 0; i < array.length; i++) {

                double j = array[i];
                if (j > min & j != 0 & j < max) {
                    multiplyRes *= j;
                }
            }

        System.out.println("The result of the multiplication of array elements located between the maximum and minimum elements is " + multiplyRes);







    }



}
