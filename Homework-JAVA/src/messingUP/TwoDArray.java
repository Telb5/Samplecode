package messingUP;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {


        /*System.out.println(list.length);
        System.out.println(list[0].length);*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the values of the table");

        int[][] matrix = new int[5][4];

        int sum = 0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();

                 sum += matrix[i][j];
            }

        }System.out.println("The total is " + sum);



        /*System.out.println(matrix.length);
        System.out.println(matrix[1].length);*/
    }
}
