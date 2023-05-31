package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        Iterator<String> iterator = words.iterator();
    while (iterator.hasNext()){
        String s = iterator.next();
        if (s.endsWith("a")){
            iterator.remove();
        }
            }
        }
    }

