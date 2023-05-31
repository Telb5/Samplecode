package Project2;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class replit188 {

        public static void main(String[] args) {

            ArrayList<Integer> num = new ArrayList<>();

            Scanner scan = new Scanner(System.in);


            int number;
            for (int i = 0; i <= 4 ; i++) {
            num.add(scan.nextInt());
            }
            for (Integer num1 : num) {
                System.out.print(num1 + " ");
                
            }




    }
}
