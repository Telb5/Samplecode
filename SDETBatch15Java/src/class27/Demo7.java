package class27;

import java.util.ArrayList;

public class Demo7 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Fizzy");
        names.add("Sav");
        names.add("Sam");
        names.add("Urwa");
        names.add("Tarik");
        names.add("Abeera");

        System.out.println(names.contains("Daris"));
        System.out.println(names);
        names.remove("Sam");
        /* here, we removed Sam from the arrayList. From there, our indexes will changes as well, for ex
        Urwa's index will be number 2 not 3
         */
        System.out.println(names);
        names.set(3, "Sam");
        System.out.println(names);
        System.out.println(names.indexOf("Savo"));
        names.set(2,"Abeera");
        System.out.println(names);


    }
}

