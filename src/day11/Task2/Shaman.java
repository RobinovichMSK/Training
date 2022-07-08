package day11.Task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    int magicAtt = 15;

    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
    }

    @Override
    public void healHimself() {
        if (health + 50 > max_health) {
            health = max_health;
        }
        health += 50;

    }

    @Override
    public void healHimself(Hero hero) {

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 30 > max_health) {
            hero.health = max_health;
        } else {
            hero.health += 30;
        }
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
        return "Shaman{" +
                "health=" + health +
                '}';
    }

}
