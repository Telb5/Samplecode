public class replit170
    {
        final void x()
            {
                System.out.println("Final method with boolean parameter");
            }

        final void x(String x)
            {
                System.out.println("Final method with String parameter");
            }

    }


class Mainer
        {
        public static void main(String[] args) {
            replit170 print = new replit170();
            print.x();
            print.x("A");
        }

    }

