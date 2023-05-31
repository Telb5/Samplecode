public class rfgf {

    public static void main(String[] args) {




        int[] numerele={10,20,30,4,5,6,7,80};
        int sum1=0;
        for (int i = 0; i <numerele.length ; i++) {

            if (numerele[i] % 2 == 0) {
                sum1 = sum1 + numerele[i];
            }
        }
        System.out.println(sum1);

    }

}
