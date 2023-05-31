package class1;

import java.util.Scanner;

public class ademexer {
    public static void main(String[] args) {

        /*Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a random character");
        char b = scan.next().charAt(0);
        String word = scan.nextLine();


        if (Character.isUpperCase(b)) {
            System.out.println("Uppercase");
        } else if (Character.isLowerCase(b)) {
            System.out.println("Lowercase");
        } else
            System.out.println("It might be a weird char");
        }
    }