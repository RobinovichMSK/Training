package day11.Task2;

abstract public class Hero implements PhysAttack {
    int health;
    int physAtt;
    double physDef;
    double magicDef;
    public static final int max_health = 100;
    public static final int min_health = 0;

    public Hero() {
        health = 100;
    }

    public void physicalAttack(Hero hero) {
        double usherb = physAtt * (1 - hero.physDef);
        if (hero.health - usherb < min_health) {
            hero.health = min_health;
        } else {
            hero.health -= usherb;
        }
    }

}
