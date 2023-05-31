package class1;

import java.util.Scanner;

public class exponentAlexLee {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = "";
        int a = 1;

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scan.nextLine();
        }
        System.out.println("Hello " + name);

        // for(a = 1; a<=10; a++){
        //  System.out.println(a);
        // }
       // for (a = 1; a < 10; a++) {
            System.out.println(a);
        //}
        while (a == 1) {
            System.out.println(a);
        }
    }
}