public class replit117 {


    int sumEvenTox(int x) {

        int sum = 1;
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                sum += i;
            }


        }return sum;
    }
    public static void main(String[] args) {

        replit117 sumEVen = new replit117();

        System.out.println(sumEVen.sumEvenTox(5));
    }
}
