package Page1;

import java.util.Arrays;
import java.util.Random;

public class ArrayHome2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10001);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        int max = array[0];
        int min = array[0];
        for (Integer i : array) {
            if (i<min) min=i; if (i>max) max=i;
        }
        System.out.println("MAX - " + max +"  "+ "MIN - "+ min);
        System.out.println();
        int nanol= 0;
        for (Integer i : array) {
             if (i%10==0) nanol++;
        }
        System.out.println("Kolichestvo chisel s koncom na nol " + nanol);
        System.out.println();

        int sumNaNol = 0;
        for (Integer i : array) {
            if (i%10==0) sumNaNol=sumNaNol+i;
        }
        System.out.println("Summa chisel na nol " + sumNaNol);
    }
    }



