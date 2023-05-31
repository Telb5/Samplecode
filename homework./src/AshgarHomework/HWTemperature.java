package AshgarHomework;

import java.util.Scanner;

public class HWTemperature {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current temperature");

        double temperature = scan.nextDouble();

        System.out.println("The temperature in the city is " + ((temperature - 32) * .5556) + "°F");
    }
}
