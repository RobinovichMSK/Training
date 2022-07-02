package day6;

public class Airplane {
    private final String manufacturer;
    private int year;
    private int length;
    private final int weight;
    private int fuel;

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
    public void Info(){
        System.out.println("manufacturer: "+ manufacturer +"," + "year: " + year + "," +
                            "length: " + length +"," + "weight: "  + weight + "," + "fuel: "+fuel);
    }
    public final void fillUp(int n ){
        fuel = fuel+n;
    }
}
