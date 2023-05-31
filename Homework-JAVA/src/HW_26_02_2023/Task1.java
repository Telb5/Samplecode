package HW_26_02_2023;

/*1) Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet*/

import java.beans.beancontext.BeanContext;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {


        Map<Integer, String> bestBuy = new HashMap<>();

        bestBuy.put(7664847, "Printer");
        bestBuy.put(7664843, "Laptop");
        bestBuy.put(7664853, "Tv");
        bestBuy.put(76648422, "watch");
        bestBuy.put(7664813, "Laptop");


        for (Map.Entry<Integer, String> items : bestBuy.entrySet()) {

            System.out.println(items);
        }
    }
}
