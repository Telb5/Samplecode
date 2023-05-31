package HW_19_02_2023;
/*
3)Create an arrayList of words. Remove every word that ends with “e”.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Task3 {

    public static void main(String[] args) {

       /* ArrayList<String> religions = new ArrayList<>();

        religions.add("Islame");
        religions.add("Christianit");
        religions.add("Buddhisme");

        Iterator<String> iterator = religions.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            if (s.endsWith("e")){
                iterator.remove();
            }
        }
    }
}*/

        TreeSet<String> countries = new TreeSet<>();

        countries.add("Morocco");
        countries.add("Turquia");
        countries.add("USA");
        countries.add("Spain");
        countries.add("Iceland");


        for (int i = 0; i < countries.size(); i++) {

        } System.out.println(countries);
    }
}
