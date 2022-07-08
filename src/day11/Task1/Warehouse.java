package day11.Task1;

// Sklad
public class Warehouse  {
    private int countPickedOrders;
    private int countDeliveredOrders;



    public Warehouse(int countPickedOrders, int countDeliveredOrders) {
        this.countPickedOrders = countPickedOrders;
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
    public void сountPickedOrders (){
        countPickedOrders++;
    }
    public void countDeliveredOrders (){
        countDeliveredOrders++;
    }
}
