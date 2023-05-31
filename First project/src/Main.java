import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times did you enter the password ? ");

        int attempt = scanner.nextInt();
        scanner.nextLine();

        System.out.println("You tried " + attempt + " times");

        if (attempt <= 5) {
            System.out.println("You have NOT exceeded the standard attempts");
        }
        else
            System.out.println("You have exceeded the standard attempts");
        }

        }
