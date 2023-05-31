package class27;

import java.util.ArrayList;

public class Demo4 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        // we use Integer as a wrapper instead of int because ArrayList doesn't hold prim-data types.
        numbers.add(15);
        numbers.add(20);
        numbers.add(45);
        numbers.add(150);
        numbers.add(200);
        numbers.add(56);

        System.out.println(numbers);
    }
}


