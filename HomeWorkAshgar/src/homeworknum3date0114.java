import java.util.Scanner;

public class homeworknum3date0114 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*
        3) Write a program that reads a range of integers
        (start and end point), provided by a user and then from that range
        prints the sum of the even and odd integers.
  */


        System.out.println("Please enter the first number");
        int start = scan.nextInt();
        System.out.println("Please enter the first number");
        int end = scan.nextInt();

        int evenNum = 0;
        int oddNumber = 0;

        if (start < end) {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    evenNum += i;
                } else {
                    oddNumber += i;
                }


            }
            System.out.println("The sum of even numbers : " + evenNum);
            System.out.println("The sum of odd numbers : " + oddNumber);
        }

        else {
            for (int i = start; i >= end; i--) {
                if (i % 2 == 0) {
                    evenNum += i;
                } else {
                    oddNumber += i;
                }

            }
            System.out.println("The sum of odd numbers : " + oddNumber);
            System.out.println("The sum of even numbers : " + evenNum);


        }

    }
}