import java.util.Scanner;

public class messingupwithJava {

    public static void main(String[] args) {

        // the code for the clock HW :

      /*  for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m < 6; m++) {
                            for (int n = 0; n <= 9; n++) {
                                System.out.println(i + "" + j + ":" + k + "" + l + ":" + m + "" + n);
                            }
                        }
                    }
                }
            }
        }
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your username");
        String name = scan.next();
        System.out.println("Enter your password");
        String password = scan.next();
        System.out.println("Confirm your password");
        int password_confirmation = scan.nextInt();

        if (name.isEmpty() || password.isEmpty()) {


        }
    }

}