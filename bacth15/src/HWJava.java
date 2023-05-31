import java.util.Scanner;

public class HWJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your heigh: ");
        int heigh = scan.nextInt();
        scan.nextLine();

        if (heigh < 60) {
            System.out.println("You are short");
        } else if (heigh >= 60 && heigh <= 72) {
            System.out.println("You are  medium");
        } else
            System.out.println("You are tall");

            scan.close();
        }
    }