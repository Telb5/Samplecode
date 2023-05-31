package class1;


import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Codiiiing {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your email address :");
        System.out.println("Enter your password :");


        String email_address = scan.nextLine();
        int password = scan.nextInt();


        if (email_address.equalsIgnoreCase("Nelson")) {
            System.out.println("Your email address is correct");
        } else {
            System.out.println("wrong email address, try again");
        }

        if (password == (1234)) {
            System.out.println("Your password is correct");
        } else {
            System.out.println("Invalid password");
        }

        if ((email_address.equals("Nelson")) && (password == (1234))) {

            System.out.println("correct credentials");

        } else {
            System.out.println("incorrect credentials");
        }
    }
}




