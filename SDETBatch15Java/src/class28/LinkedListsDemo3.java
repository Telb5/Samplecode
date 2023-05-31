package class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListsDemo3 {

    public static void main(String[] args) {

        // linked-list == 160 ms
        //ArrayList == 67285 ms


        long startTime = System.currentTimeMillis();
        ArrayList<String> numbers = new ArrayList<>();
        //LinkedList<String> numberss = new LinkedList<>();    // we can either use this or Array List but Array List will be slower.
        for (int i = 0; i < 1000000; i++) {
            numbers.add(0, "Test data");
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
