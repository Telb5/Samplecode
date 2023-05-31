package AshgarHomework;

import java.util.Scanner;

public class HWDMVagent {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your age ?");
        int age = scan.nextInt();

        if (age>=18){
            System.out.println("Driver's license can be issued");
        }else{
            System.out.println("You will need to apply for a learners permit");
        }
    }
}
