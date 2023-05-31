import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = scan.next();

        System.out.println("The first 3 letters of " + word +" is "+ word.substring(0,3));

    }
}