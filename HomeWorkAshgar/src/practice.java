import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a num : ");
        int n = scan.nextInt();

        int sum = 1;
        for (int i = 2; i <= n/2 ; i++)
            if(n % 1 == 0)
            sum += i;

            System.out.println(sum == 1 ? "Prime" : "not prime");
            }
    }

