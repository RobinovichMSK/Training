package day8;

public class Task1 {
    public static void main(String[] args) {

       long startTime = System.currentTimeMillis();
       String numbers = "";
        for (int i=0; i<=20000;i++)
        numbers += i + " ";
        long stopTime = System.currentTimeMillis();
        System.out.println("Dlitelnost raboti: "+ (stopTime-startTime)+ " mc");
        System.out.println();


        long nachalo = System.currentTimeMillis();
        StringBuilder bumbers = new StringBuilder();
        for (int i=0; i<=20000;i++) {
            bumbers.append(i).append(" ");
        }
        long konec = System.currentTimeMillis();
        System.out.println("Dlitelnost raboti: "+ (konec-nachalo)+ " mc");
    }
}
