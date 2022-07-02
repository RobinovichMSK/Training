package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Pacistan", 2020, 250, 18500, 0);
        a1.Info();
        a1.setYear(2021);
        a1.setLength(260);
        a1.fillUp(100);
        a1.fillUp(899);
        a1.Info();
    }
}
