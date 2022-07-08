package day11.Task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior war = new Warrior();
        Paladin pal = new Paladin();
        Magician mag = new Magician();
        Shaman sham = new Shaman();

        war.physicalAttack(pal);
        System.out.println(pal);

        pal.physicalAttack(mag);
        System.out.println(mag);

        sham.healTeammate(mag);
        System.out.println(mag);

        mag.magicalAttack(pal);
        System.out.println(pal);

        sham.physicalAttack(war);
        System.out.println(war);

        pal.healHimself(pal);
        System.out.print(pal);

        System.out.println("");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            war.physicalAttack(mag);
            System.out.println(mag);
        }
    }
}
