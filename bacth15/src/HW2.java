import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day num ");
        int day = scan.nextInt();
        scan.nextLine();

        if (day>=1 && day<=5){
            System.out.println("Weekday");

        }else if (day>=6 && day<=7){
        System.out.println("Weekend");
    }
        else {
            System.out.println("invalid day");
        }
        }
}
