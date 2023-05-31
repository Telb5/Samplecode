package class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainMethod {

    public static void main(String[] args) {

        Set<J06Entry> entrySet= new LinkedHashSet<>();
        entrySet.add(new J06Entry(1, "Nazir"));
        entrySet.add(new J06Entry(2, "Shah"));
        entrySet.add(new J06Entry(3, "Tami"));
        entrySet.add(new J06Entry(4, "Aisha"));
        entrySet.add(new J06Entry(5, "Gul"));
        entrySet.add(new J06Entry(6, "Bahar"));
        entrySet.add(new J06Entry(7, "Saba"));

        entrySet.removeIf(s -> s.getKey()>2 && s.getValue().contains("i"));
        System.out.println(entrySet);


    }
}
