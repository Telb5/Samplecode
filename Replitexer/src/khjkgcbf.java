import java.util.Scanner;
public class khjkgcbf {
    public static void main(String[] args) {



            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your graded mark?");
            int mark = sc.nextInt();

            if (mark > 1) {
                System.out.println("Your grade is F");
            }

            if (mark > 25) {
                System.out.println("Your grade is E");
            }

            if (mark > 45) {
                System.out.println("Your grade is D");
            }

            if (mark > 50) {
                System.out.println("Your grade is C");
            }

            if (mark > 60) {
                System.out.println("Your grade is B");
            }

            if (mark > 80) {
                System.out.println("Your grade is A");
            } else {
                System.out.println("Please enter valid mark");
            }


        }


    }
