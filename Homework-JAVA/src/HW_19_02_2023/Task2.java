package HW_19_02_2023;

import java.util.ArrayList;

/*
2)Create an arraylist of cars and retrieve all the values using 3 different ways.
 */
public class Task2 {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Porsche");
        cars.add("Mercedes");

        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {

        }System.out.println(cars);


        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));

    }
}
