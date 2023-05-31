import java.util.Scanner;

public class replit99 {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below

        StringBuilder str = new StringBuilder(givenString);
        str.reverse();

        String reversedStr = str.toString();

        if (givenString.equals(reversedStr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

