import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your birth month : ");

        String month = scan.nextLine();

        if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
            System.out.println("You were born in fall");
        } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
            System.out.println("You were born in winter");
        } else if ((month.equalsIgnoreCase("September")) || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
            System.out.println("You were born in spring");
        } else if ((month.equalsIgnoreCase("December")) || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
            System.out.println("You were born in summer");
        } else {
            System.out.println("");
        }
    }
}