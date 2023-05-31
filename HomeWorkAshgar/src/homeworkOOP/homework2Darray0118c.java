package homeworkOOP;

public class homework2Darray0118c {
    public static void main(String[] args) {

//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers


        int [][] numbers = {{1, 18, 29},
                            {4, 34, 20},
                            {9, 31, 17}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }

    }
}
