package day12.Task1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String>arrayList = new ArrayList<>();
        arrayList.add("Mersedes");
        arrayList.add("Audi");
        arrayList.add("BMW");
        arrayList.add("Lada");
        arrayList.add("RENO");
        arrayList.add(3,"Nissan");
        arrayList.remove(0);
        System.out.println(arrayList);

    }
}
