package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rdm = new Random();
        final int min = 90;
        final int max = 101;
        final int rdmStamina = rdm(min, max);

        Player p1 = new Player(rdmStamina);
        Player p2 = new Player(rdmStamina);
        Player p3 = new Player(rdmStamina);
        Player.info();
        Player p4 = new Player(rdmStamina);
        Player p5 = new Player(rdmStamina);
        Player p6 = new Player(rdmStamina);
        Player.info();
        Player p7 = new Player(rdmStamina);
        Player.info();

        for (int i = 0; i < 10; i++)
            p1.run(p1);

        Player.info();
    }

    private static int rdm(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}
