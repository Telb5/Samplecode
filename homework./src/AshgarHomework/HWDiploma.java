package AshgarHomework;

import java.util.Scanner;

public class HWDiploma {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Do you have a diploma?");
        boolean diploma = input.nextBoolean();
        System.out.println("what is your gpa?");
        double gpa = input.nextDouble();

        if (diploma){
            System.out.println("Congratulations");
        }else {
            System.out.println("You should get a degree");
        }

        ////////

        if ((diploma) && (gpa >= 3.5)){
            System.out.println("You are eligible for scholarship");
        }else{
            System.out.println("You should have studied harder");
        }
    }
}
