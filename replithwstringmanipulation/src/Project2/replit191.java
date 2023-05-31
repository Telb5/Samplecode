package Project2;

import java.util.LinkedList;

public class replit191 {

    public static void main(String[] args) {
        LinkedList<Boolean> ListA = new LinkedList<>();

        ListA.add(true);
        ListA.add(false);
        ListA.add(false);

        LinkedList<Boolean> ListB = new LinkedList<>();
        ListB.addAll(ListA);

        for (Boolean List:ListB) {
            System.out.println(List);
        }


    }
}
