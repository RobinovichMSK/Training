package day11.Task1;

// Sborchik
public class Picker implements Worker {
    private double salary;
    private boolean isPayed;
    private Warehouse house;

    public Picker(double salary, boolean isPayed, Warehouse house) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.house = house;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{}";
    }

    public void doWork() {
        salary += 80;
        house.сountPickedOrders();
    }

    public void bonus() {

        if (isPayed == true) {
            System.out.println("Bonus uje bil viplachen");
        return;}
        if ((house.getCountPickedOrders()) < 10000){
            System.out.println("Bonus poka ne dostupen");
        return;}
        if ((house.getCountPickedOrders() == 10000)) {
            salary += 70000;
            isPayed = true;
        }
    }
}

