package Page1;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class ArrayHome {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int[] n = new int[sc.nextInt()];
        for (int i = 0; i <n.length; i++) {
            n[i]= rand.nextInt(10);
        }
        for (Integer array: n) {
            System.out.println(array);
            }
        System.out.println("Dlina massiva " + n.length);
        System.out.println();

        for (Integer number : n) {
            if (number > 8){
                for (int i =0; i>8; i++){
                System.out.println("Kolvo >8 " + i );
            }
            }
        }


//        System.out.println("kol-v0 chisel >8 : "+  хз что-то  );}
//
//
//
//        System.out.println();
//        int sum =0;
//        for (int n1: n) {
//            sum = sum+n1;
//        }
//        System.out.println("Summa chisel massiva " + sum);
//        System.out.println();





    }
}
