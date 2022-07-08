package day11.Task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(0, 0);
        Picker picker1 = new Picker(0, false, warehouse);
        Courier courier1 = new Courier(0, false, warehouse);

        Picker picker2 = new Picker(0, false, warehouse);

        businessProcess((Worker) picker1);
        businessProcess((Worker) courier1);
        System.out.println("zarplata sborchika " + picker1.getSalary());
        System.out.println("zarplata couriera " + courier1.getSalary());
        picker1.bonus();

        picker2.doWork();
        System.out.println(picker2.getSalary());
        System.out.println(picker1.getSalary());
    }
    public static void businessProcess(Worker worker) {
        for (int i = 1; i <= 10000; i++) {
            worker.doWork();}
        worker.bonus();

    }
}
