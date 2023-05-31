
import java.util.Scanner;

public class Ashgarexerc {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }


        for (int ii = 100; ii >= 1; ii--) {
            System.out.println(ii);
        }


        for (int i = 20; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        for (int i = 20; i >= 0; i -= 2) {
            System.out.println(i);
        }


        for (int i = 20; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }


        for (int i = 49; i >= 20; i -= 2) {
            System.out.println(i);


        }
    }
}

