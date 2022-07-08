package day11.Task1;

// Kuryer
public class Courier implements Worker {
    private double salary;
    private boolean isPayed;
    private Warehouse house;

    public Courier(double salary, boolean isPayed, Warehouse house) {
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
        return "Courier{}";
    }

    public void doWork() {
        salary += 100;
        house.countDeliveredOrders();
    }

    public void bonus() {
        if (isPayed == true) {
            System.out.println("Bonus uje bil viplachen");
            return;}
        if ((house.getCountDeliveredOrders()) < 10000){
            System.out.println("Bonus poka ne dostupen");
            return;}

        salary += 50000;
        isPayed = true;
    }
}
