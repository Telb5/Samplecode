public class homework6date0114 {

    public static void main(String[] args) {

        /*
6) Print the following pattern:

     *

     *

     *
     **
     *
     **
     *

*/

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 2; j++) {

                if ((j == 1) && (j==3)) {
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}