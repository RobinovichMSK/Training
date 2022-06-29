package Page1;

import java.util.Random;

public class ArrayHome3 {
    public static void main(String[] args) {

        int[][] array = new int[12][8];
        Random rand = new Random();

        for (int m = 0; m < 12; m++)
            for (int n = 0; n < 8; n++)
                array[m][n] = rand.nextInt(51);
        for (int m = 0; m < 12; m++) {
            for (int n = 0; n < 8; n++)
                System.out.print(array[m][n] + " ");
            System.out.println();
        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int m =0; m< array.length; m++){
            int sum =0;
            for (int n =0; n < array[m].length; n++){
                sum += array[m][n];
            }
            if (maxSum <= sum){
                maxSum = sum;
                maxSumIndex = m;
            }
        }
        System.out.println("maxSum "+ maxSum);
        System.out.println("maxSumIndex "+ maxSumIndex);
    }
}



