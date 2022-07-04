package day7;

public class Task1 {
    public static void main(String[] args) {
    Airplane airplane1= new Airplane("Russia",2020,252,18500,0);
    Airplane airplane2= new Airplane("Russia",2020,258,18500,0);
    Airplane.compareAirplanes(airplane1,airplane2);
    }
}
