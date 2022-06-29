package Page1;

import java.util.Arrays;
import java.util.Random;

public class ArrayHome4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10001);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        int maxSum = 0;
        int maxSumInd = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumInd = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumInd);
    }
}

