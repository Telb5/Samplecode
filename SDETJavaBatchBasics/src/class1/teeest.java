package class1;

import java.util.ArrayList;
import java.util.Scanner;

public class teeest {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Hi user, how can I help you today ?");
        String answer = scn.nextLine();

        ArrayList scripts = new ArrayList<>();
        scripts.add("test3");
        scripts.add("test4");
        scripts.add("test5");

        if (answer.equals(scripts)) {
            System.out.println("I do not understand what " + answer + " means. Could you please explain ?");
        }
    }
}