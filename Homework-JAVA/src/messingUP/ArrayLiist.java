package messingUP;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLiist {

    public static void main(String[] args) {

 /*       ArrayList<String> obj = new ArrayList<String>();

        obj.add("Casa");
        obj.add("Kesh");
        obj.add("Agadir");
        obj.add("Sale");


        System.out.println(obj);

        obj.add(2, "Rabat");
        System.out.println(obj);
        obj.set(3, "Maghrib");
        System.out.println(obj);*/

/*
        String array[] = {"one", "Two", "Three", "Four"};
        String array2[] = new String[10];


        array2[0] = "1";


        System.out.println(array2[0]);
        System.out.println(array2[2]);*/


        int grade = 0, sum = 0, counter = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 6 grades to get the average");

        do {
            System.out.println("Enter grade for student no " + counter);
            grade = input.nextInt();
            sum += grade;

            counter++;
        }

        while (counter<=5);
            System.out.println("Average of the grades is " + sum/6);



    }
}