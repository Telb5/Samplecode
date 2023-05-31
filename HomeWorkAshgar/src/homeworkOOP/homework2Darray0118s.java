package homeworkOOP;

public class homework2Darray0118s {
    public static void main(String[] args) {

/*Create a 2D array or integer type where you
 will store odd and even numbers in 3 rows and 4 columns.
 Develop a program which will identify/print the even numbers only. */

        int [][] numbs = {{1, 2, 5, 9},
                         {18, 12, 11, 3},
                         {22, 23, 78, 91}};

        int sum = 0;

        for (int i = 0; i < numbs.length; i++) {
            for (int j = 0; j < numbs[i].length; j++) {
                if (numbs[i][j]%2==0){
                    sum = sum + numbs[i][j];
                    System.out.println(numbs[i][j]);

                }
            }
        }System.out.println(sum);


        }
}
