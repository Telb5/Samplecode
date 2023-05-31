import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {


            System.out.print("Enter a num : ");
            int num1 = scan.nextInt();

            System.out.print("Enter a num : ");
            int num2 = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter an operator : ");
            char operator = scan.next().charAt(0);
            scan.nextLine();

            char add = '+', sub = '-', multi = '*', div = '/', mod = '%';

            double result = 0;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = (num1 * num2);
            } else if (operator == '/') {
                result = (num1 / num2);
            } else if (operator == '%') {
                result = (num1 % num2);
            } else {
                System.out.println("invalid operator");
            }
                if (operator == add || operator == sub || operator == multi || operator == div || operator == mod) {
                    System.out.println("The result is " + result);
                    break;
                }
            }
        }
    }
