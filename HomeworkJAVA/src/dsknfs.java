import java.util.Scanner;

public class dsknfs {
    public static void main(String[] args) {

            /*Write a program to find largest
number among three numbers using
nested if provided by a user (numbers
must be distinct)
HomeWork*/


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number");
        int num1 = scanner.nextInt();

        System.out.println("Please enter second number");
        int num2 = scanner.nextInt();

        System.out.println("Please enter third number");
        int num3 = scanner.nextInt();




        if (num1 > num2 && num1 > num3) {
            System.out.println("Num1 : " + num1 + " is the greatest number ");
        }
        if (num2 > num1 && num2>num3) {
            System.out.println("Num2 : " + num2 + " is the greatest number ");
        }
        else if (num3>num1 && num3>num2){
            System.out.println("Num3 : " + num3 + " is the greatest number ");
        }
    }
}