package day6;

class Motorbike {
    private final String name;
    private final String color;
    private final int age;
    private final int inputYear;
    public Motorbike(String name, String color, int age,int inputYear){
        this.name = name;
        this.color = color;
        this.age = age;
        this.inputYear= inputYear;
    }
    public  String getName() {
        return name;
    }
    public  String getColor() {
        return color;
    }
    public int getAge() {
        return age;
    }
    public int getInputYear() { return inputYear; }
    public void Info(){
    System.out.println("Eto motocikl");
    }
    public void yearDifference(){
        int difference;
        difference = inputYear-age;
        System.out.println(Math.abs(difference));
    }
}

