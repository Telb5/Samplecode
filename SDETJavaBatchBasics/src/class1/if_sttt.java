package class1;


import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class if_sttt {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your email address");
        String email_address = scan.nextLine();


        System.out.println("Enter your password");
        String password = scan.nextLine();


        if (email_address.equalsIgnoreCase("Nelson123@gmail.com")) {
            System.out.println("Your email address is correct");
        } else {
            System.out.println("wrong email address, try again");
        }

        if (password.equals("1234")) {
            System.out.println("Your password is correct");
        } else {
            System.out.println("Invalid password");
        }



        if ((email_address.equals("Nelson123@gmail.com"))) {

            if (password.equals("1234")) {
                System.out.println("correct credentials");

            } else {
                System.out.println("incorrect credentials");
            }

            if ((email_address.equals("Nelson123@gmail.com"))) {

                if ((password.equals("Nelson123@gmail.com"))) {
                    System.out.println("correct credentials");

                } if (email_address.equals("Nelson123@gmail.com")) {

                }
                if ((password != ("1234"))) {
                    System.out.println("incorrect credentials");
                }
            }
        }
    }
}

