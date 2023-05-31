package Project2;

import java.util.LinkedList;

public class replit189 {

    public static void main(String[] args) {
        LinkedList<Integer> Objects = new LinkedList<>();
        for (int i = 50; i <= 100; i++) {
            if (i % 3 == 0)
                Objects.add(i);


            }
            System.out.print(Objects + " ");
        }
    }