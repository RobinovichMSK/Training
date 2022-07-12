package day12.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Task2 a = new Task2();
        a.setRange(0, 30, numbers);
        a.setRange(300, 350, numbers);

        System.out.println(numbers);

    }

    public void setRange(int x, int y, List<Integer> numbers) {
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0)
                numbers.add(i);
        }
    }

}

