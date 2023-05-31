package class1;

import java.util.Scanner;

public class ExerciseAdem {
    public static void main(String[] args) {

        ///Administrator_name : Iniesta

        Scanner scan_test = new Scanner(System.in);

        System.out.println("Enter the status of the game");
        String gameStatus = scan_test.nextLine();


        ////

        System.out.println("Enter the team's score");
        int teamScore = scan_test.nextInt();

        ////

        System.out.println("Enter the team's score");
        int opposingteamScore = scan_test.nextInt();


        if (gameStatus.equals("Suspended")) {
            System.out.println("Game is suspended");


        } if (gameStatus.equals("not Suspended")){
            System.out.println("Game is not suspended");
            if (teamScore > opposingteamScore) {
                System.out.println("the team won");
            } else if (teamScore == opposingteamScore) {
                System.out.println("the team tied");
            } else {
                System.out.println("the team lost");
            }
        }
    }
}
