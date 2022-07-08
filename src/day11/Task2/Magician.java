package day11.Task2;

public class Magician extends Hero implements MagicAttack {
    int magicAtt = 20;

    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magicAtt * (1 - hero.magicDef);
        if (hero.health - attackScore < min_health) {
            hero.health = min_health;
        } else {
            hero.health -= attackScore;
        }
    }

    @Override
    public void physicalAtt(Hero hero) {}

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }


}
