import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Positive Integer: ");
        int num = sc.nextInt();

        if (num > 0) {

            for (int i = 1; i <= 10; i++) {
                int multiply = num * i;
                System.out.println(num+" x "+i+" = " +multiply);
            }
        } else if (num < 0) {
            System.out.println("Negative Input");
        } else {
            System.out.println("Number is Zero");
        }
    }
}

