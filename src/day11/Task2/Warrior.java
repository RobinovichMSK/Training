package day11.Task2;

public class Warrior extends Hero {

    public Warrior() {
        physAtt = 30;
        physDef = 0.8;
        magicDef = 0;
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }

    @Override
    public void physicalAtt(Hero hero) {

    }
}

