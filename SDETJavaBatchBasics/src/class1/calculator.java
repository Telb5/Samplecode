package class1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter num1 : ");
            double num1 = scan.nextDouble();
            System.out.print("Enter num2 : ");
            double num2 = scan.nextDouble();
            scan.nextLine();
            System.out.print("Enter operator : ");
            char operator = scan.next().charAt(0);

            double result = 0;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                result = num1 / num2;
            } else if (operator == '%') {
                result = num1 % num2;
            } else {
                System.out.println("invalid operator");
            }
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                    System.out.println("The result is : " + result);

                    System.out.println("Do you want to quit ?");
                    String decision = scan.next();
                    scan.nextLine();


                    if (decision.equalsIgnoreCase("Yes")) {

                        System.out.println("Thank you for using our app");
                        break;
                    }
                    if (decision.equalsIgnoreCase("No")) {
                        System.out.print("");
                    }
                }
            }
        }
    }
