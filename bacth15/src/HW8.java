import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your grade : ");
        String grade = scan.nextLine();


        if(grade.equalsIgnoreCase("A")){
            System.out.println("Excellent");
        }else if (grade.equalsIgnoreCase("B")){
            System.out.println("Good");
        }else if (grade.equalsIgnoreCase("C")) {
            System.out.println("Average");
        }else if (grade.equalsIgnoreCase("D")) {
            System.out.println("Bad");
        }else {
            System.out.println("Not acceptable");
        }
    }
}
