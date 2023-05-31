public class replit169
    {
        int sum = 0;

        final double avgElements(int[] a)
            {
                for (int i = 0; i < a.length; i++)
                {
                    sum += a[i];
                }

                return ((double) sum / a.length);
                // double sum1 = sum;
              // return (sum/(double)5);
            }

}


class Mainnnnn
    {
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        replit169 print = new replit169();
        System.out.println(print.avgElements(a));
    }
}