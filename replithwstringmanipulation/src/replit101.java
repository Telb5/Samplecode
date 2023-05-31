import java.util.Scanner;

public class replit101 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        for (int i = 0; i < s.length() ; i+=2) {
            System.out.print(s.charAt(i));
        }
    }
}
