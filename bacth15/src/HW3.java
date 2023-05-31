import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quiz score: ");
        int Quiz = scan.nextInt();
        System.out.print("Mid term score: ");
        int Mid = scan.nextInt();
        System.out.print("Final score: ");
        int Final = scan.nextInt();


       int average = ((Quiz + Mid + Final)/3);
        System.out.println("Your average is : " + average);


       if (average>=90){
           System.out.println("Grade = A");
       }else if (average>=70 && average<90){
           System.out.println("Grade = B");
       } else if (average>=50 && average<70) {
           System.out.println("Grade = c");
       }
       else {
           System.out.println("Grade = F");
       }

    }
}
