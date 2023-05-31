package Project2;

import java.util.LinkedList;

public class replit190 {

        public static void main(String[] args) {
            LinkedList<Integer> test = new LinkedList<>();
            int a = 0, b = 1;
            System.out.print(a + " " + b + " ");

            for (int i = 2; i < 10; i++) {
                int sum = a + b;
                System.out.print(sum + " ");
                a = b;
                b = sum;
            }
        }
    }

