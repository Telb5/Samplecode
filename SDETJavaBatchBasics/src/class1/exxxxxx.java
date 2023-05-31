package class1;

import java.util.Scanner;

public class exxxxxx {
    public static void main(String[] args) {
        /*Write a program that accepts three numbers from the user and prints "increasing" if the numbers
are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing
or decreasing order" otherwise. Go to the editor
        Test Data
        Input first number: 1524
        Input second number: 2345
        Input third number: 3321
        */


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first num");
        int number_1 = scan.nextInt();

        System.out.println("Please enter second number");
        int number_2 = scan.nextInt();

        System.out.println("Please enter third number");
        int number_3 = scan.nextInt();

        if (number_1 < number_2 && number_2 < number_3) {
                System.out.println("increasing");

        } else if (number_1 > number_2 && number_2 > number_3) {
            System.out.println("decreasing");

        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
