
class Mainp extends replit151{
    public static void main(String[] args) {

        replit151 arrays = new replit151();

        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }};

        System.out.println(replit151.sum2D(a));

    }
}


public class replit151 {       //METHOD CLASS


    static int sum2D(int [][] a) {

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum += a[i][j];
            }
        }return sum;
    }

}

