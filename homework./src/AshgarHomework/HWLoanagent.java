package AshgarHomework;

import java.util.Scanner;
public class HWLoanagent {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the amount of loan you will be needing ?");
        int loanAmount = scan.nextInt();


        if (loanAmount<=200000){
            System.out.println("The loan will be approved");
        }else{
            System.out.println("The loan has been rejected");
        }
    }
}
