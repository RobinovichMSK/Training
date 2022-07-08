package Page1;

import java.util.Random;
import java.util.Scanner;

public class ArrayHome {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int[] n = new int[sc.nextInt()];
        for (int i = 0; i < n.length; i++) {
            n[i] = rand.nextInt(11);
        }
        for (Integer array : n) {
            System.out.print(array + " ");
        }
        System.out.println("Dlina massiva " + n.length);
        System.out.println();

//       Количество чисел > 8 ?
        int counter = 0;
        for (Integer i : n) {
            if (i > 8) {
                counter = counter + 1;
            }
        }
        System.out.println("Kolichestvo chisel > vosmi " + counter);


        //       Количество чисел = 1
        int counter2 = 0;
        for (Integer i : n) {
            if (i == 1) {
                counter2 = counter2 + 1;
            }
        }
        System.out.println("Kolichestvo chisel = odnomu " + counter2);

        int chet = 0;
        for (Integer i : n) {
            if (i % 2 == 0) {
                chet = chet + 1;
            }
        }
        System.out.println("Kolichestvo chisel chetnih " + chet);
        int nechet = 0;
        for (Integer i : n) {
            if (i % 2 != 0) {
                nechet = nechet + 1;
            }
        }
        System.out.println("Kolichestvo chisel ne chetnih " + nechet);
        int sum = 0;
        for (Integer i : n) {
            sum = sum + i;
        }

        System.out.println("Summa chisel massiva =  " + sum);


    }
}
