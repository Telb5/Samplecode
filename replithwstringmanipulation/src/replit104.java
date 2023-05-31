import java.util.Scanner;

public class replit104 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] names = new String[5];

names [0] = scan.nextLine();
names [1] = scan.nextLine();
names [2] = scan.nextLine();
names [3] = scan.nextLine();
names [4] = scan.nextLine();

        for (int i = 0; i <names.length ; i++) {

            System.out.println(names[i].substring(0,3));
        }
    }
}
