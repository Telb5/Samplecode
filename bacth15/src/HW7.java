import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your home country : ");
        String country = scan.nextLine();

        String India = "Hindi", Morocco = "Darija", Portugal = "Portuguese", Turkiya = "Turkish", Afghanistan = "Pashto";

        switch (country) {
            case "India":
                System.out.println("You are from " + country + " and you are speaking " + India);
                break;

            case "Morocco":
                System.out.println("You are from " + country + " and you are speaking " +  Morocco);
                break;

            case "Portugal":
                System.out.println("You are from " + country + " and you are speaking " +  Portugal);
                break;

            case "Turkey":
                System.out.println("You are from " + country + " and you are speaking " +  Turkiya);
                break;

            case "Afghanistan":
                System.out.println("You are from " + country + " and you are speaking " +  Afghanistan);
                break;

        default:
            System.out.println("Not found in the data base");

        }
    }
}