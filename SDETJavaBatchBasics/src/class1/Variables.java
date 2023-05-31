package class1;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        System.out.println("Your name ?");
        String tle = scn.nextLine();
        System.out.println("your age ?");
        int age = scn.nextInt();


        if (tle.equalsIgnoreCase("Tarik")) {
            System.out.println("Hello " + tle + " you are " + age + " years old");
        } else {
            System.out.println("No name recorder into the system");
        }
    }
}