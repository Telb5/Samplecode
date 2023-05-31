public class replit168
    {
        final String reversing(String x)
            {
             StringBuilder revers = new StringBuilder(x);
           revers.reverse();
             return revers.toString();
            }
}



class Maaaiin
    {
        public static void main(String[] args) {
            replit168 print = new replit168();
            String str = print.reversing("hello");
            System.out.println(str);
        }
    }



