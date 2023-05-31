public class replit132 {

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        reduce10(a);

        //create method reduce10 here

    }

    static int reduce10(int[][] a) {

        int add = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                add = ((a[i][j]) - 10);
                                                 //   System.out.print(add);
            }                                                 //System.out.println("");

        }return add;
    }
}

