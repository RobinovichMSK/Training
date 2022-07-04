package day7;

public class Airplane {
    private final String manufacturer;
    private int year;
    private int length;
    private final int weight;
    private int fuel;
//    public static int compareAirplanes();

    public Airplane(String manufacturer, int year, int length, int weight, int fuel) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public void setManufacturer(String manufacturer) {
        manufacturer = manufacturer;
    }

    public final void setYear(int year1) {
        year = year1;
    }

    public final void setLength(int length1) {
        length = length1;
    }

    public void setWeight(int weight) {
        weight = weight;
    }

    public void setFuel(int fuel) {
        fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void Info() {
        System.out.println("manufacturer: " + manufacturer + "," + "year: " + year + "," +
                "length: " + length + "," + "weight: " + weight + "," + "fuel: " + fuel);
    }

    public final void fillUp(int n) {
        fuel = fuel + n;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length == airplane2.length) {
            System.out.println("Samoleti odinakovie");
        } else if (airplane1.length > airplane2.length){
            System.out.println("Samolet-1 dlinnee");
        } else {
            System.out.println("Samolet-2 dlinnee");
        }
        return;
    }
}