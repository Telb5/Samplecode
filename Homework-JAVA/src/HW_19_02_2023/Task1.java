package HW_19_02_2023;

import java.util.ArrayList;

public class Task1 {
    /*
1) Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */


        public static void main(String[] args) {

            ArrayList<String> names = new ArrayList<String>();

            names.add("Abeera");
            names.add("Hiral");
            names.add("Adem");
            names.add("Nelson");
            names.add("Daria");

            String name = "Abeera";

            System.out.println(names.isEmpty());

            System.out.println(names.contains("Adem"));

           // if (names.contains(name)) {
            //    System.out.println(true);
           // }

            System.out.println(names.size());
            System.out.println(names);
        }
    }