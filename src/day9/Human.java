package day9;

public class Human {
    protected String nameHuman;
    public Human(String nameHuman){
        this.nameHuman = nameHuman;
    }
    public void setNameHuman(String nameHuman) {
        this.nameHuman = nameHuman;
    }
    public String getNameHuman() {
        return nameHuman;
    }

    public void printInfo() {
        System.out.println("Etot chelovek s imenem " + nameHuman);
    }

}
