import java.util.Scanner;

public class homeworknum2date0114 {
   public static void main(String[] args) {

        /*
        2) Create a program that will be asking user
        to apply for a credit card 10 times. As soon you get
         an “yes” from a user program should stop asking.
         */

      Scanner scan = new Scanner(System.in);

        int num = 1;

        String n;

        do {
            System.out.println("Do you need a credit card ? ");
            n = scan.nextLine();
            num++;

            if (n.equalsIgnoreCase("Yes")) ;
            continue;

        } while (n.equalsIgnoreCase("No") && (num<=10));



                }
                }

      /*  Scanner scan = new Scanner(System.in);


        for(int i = 0; i<10; i++) {
            System.out.println("Do you need a credit card ? ");
            if (scan.next().equalsIgnoreCase("No")) {

            }else {
                System.out.println("You will miss out on the deal");
                break;

            }

        }
        */