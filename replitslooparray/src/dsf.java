import java.util.Scanner;

public class dsf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];


        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = input.nextInt();

        }
            for (int j = 1; j <= numbers.length; j++) {

                System.out.println(j*10);

            }
        }
    }