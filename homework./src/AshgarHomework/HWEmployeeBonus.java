package AshgarHomework;

import java.util.Scanner;

public class HWEmployeeBonus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many years have you worked?");
        int yearsOfWork = scan.nextInt();

        System.out.println("What is your annual salary?");
        int annualSalary = scan.nextInt();

        if (yearsOfWork >= 5) {
            System.out.println("The employee is eligible for a bonus");
        }else{
            System.out.println("The employee is not eligible for a bonus");
        }

        if (yearsOfWork >= 5){
            if (annualSalary>50000){
                System.out.println("Bonus will be set around $5000");
            }
            else{
                System.out.println("Bonus will be set around $3000");
            }
        }
    }
}
