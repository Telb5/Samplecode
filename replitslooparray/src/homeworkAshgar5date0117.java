public class homeworkAshgar5date0117 {

    public static void main(String[] args) {

//5)Create a 2D array of integers.
//Develop a program which will calculate the sum of  even and odd numbers for that array.


        int[][] numbers = {{12, 13},
                {9, 2},
                {8, 6}};

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sum1 = sum1 + numbers[i][j];
                }
                if (numbers[i][j] % 2 != 0) {
                    sum2 = sum2 + numbers[i][j];
                }

            }


        }
        System.out.println(sum1);
        System.out.println(sum2);


    }
}