package AshgarHomework;

import java.util.Scanner;

public class HWCreditCard {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        System.out.println("Do you have a credit card ?");
        String creditCard = scan.nextLine();
        if (creditCard.equals("No")){
            System.out.println("I would like to offer you a fee free credit card");
        }

        if (creditCard.equals("Yes")){
            System.out.println("What is your current balance on the card ?");
            int cardBalance = scan.nextInt();

            if (cardBalance>1000) {
                System.out.println("You will need to pay it off immediately");
            }else {
                System.out.println("You can spend more");
            }

        }
    }
}
