import com.sun.source.tree.IfTree;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class fdfd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int sum1;
        int sum2;

        do {

            System.out.println("Please enter an even num");
            int evenNum = scan.nextInt();
            System.out.println("Please enter an even num");
            int evenNum1 = scan.nextInt();
            System.out.println("Please enter an odd num");
            int oddNum = scan.nextInt();
            System.out.println("Please enter an odd num");
            int oddNum1 = scan.nextInt();


            sum1 = (evenNum + evenNum1);
            sum2 = (oddNum + oddNum1);
            String answer = scan.nextLine();


            if ((evenNum % 2 == 0) && (evenNum1 % 2 == 0)) {
                System.out.println("You have entered two even numbers, the sum is " + sum1);
            }
            if ((oddNum % 2 != 0) && (oddNum1 % 2 != 0)) {
                System.out.println("You have entered two odd numbers, the sum is " + sum2);


            }
            if ((evenNum % 2 == 0) && (oddNum % 2 == 0)) {
                System.out.println("You have entered 2 even numbers, please try again");

            } else if ((evenNum % 2 != 0) && (oddNum % 2 != 0)) {
                System.out.println("You have entered 2 odd numbers, please try again");

            } else if ((evenNum % 2 != 0) && (oddNum % 2 == 0)) {
                System.out.println("You have entered the odd number in the first box, and the even number in the second box, please try again");
            }
            System.out.println("Do you want to continue?");
            if (answer.equalsIgnoreCase("No")) {

            } else if (answer.equalsIgnoreCase("Yes")) {
                boolean falsee = true;

            }



        }while (true) ;
    }
}

