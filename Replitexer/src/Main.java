import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two integers : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter two strings : ");
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();


        if (num1 == num2 && word1.equalsIgnoreCase(word2)) {
            System.out.println("AND");
        } else if (num1 == num2 || word1.equalsIgnoreCase(word2)) {
            System.out.println("OR");
        } else if (num1 != num2 && !word1.equalsIgnoreCase(word2)) {
            System.out.println("NONE");


      /* - if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
                - if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
                - if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE"
    */

        }
    }
}
