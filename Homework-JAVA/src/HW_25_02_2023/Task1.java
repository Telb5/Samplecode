package HW_25_02_2023;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/*Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;*/

public class Task1 {
    public static void main(String[] args) {


        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Casablanca");
        cities.add("Marrakech");
        cities.add("Agadir");

        cities.removeIf(city->city.startsWith("A")||city.startsWith("a"));

        System.out.println(cities);


    }
}