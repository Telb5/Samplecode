package class28;

import java.util.LinkedList;

public class LinkedListsDemo {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Mo");
        linkedList.add("Mo2");
        linkedList.add("Amine");
        linkedList.add("Salouan");
        linkedList.add("Abeera");
        System.out.println(linkedList);


        for (String link:linkedList) {
            System.out.print(link + " ");
        }

    }
}
