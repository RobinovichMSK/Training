package day11.Task2;

public class Paladin extends Hero implements Healer {

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }


    @Override
    public void healHimself() {

    }

    @Override
    public void healHimself(Hero hero) {
        if (health + 25 > 100) {
            health = max_health;
        } else {
            health += 25;
        }
    }

    @Override
    public void healTeammate(Hero hero) {

        if (hero.health + 10 > 100) {
            hero.health = max_health;
        } else {
            hero.health += 10;
        }
    }

    @Override
    public void physicalAtt(Hero hero) {}

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }


}