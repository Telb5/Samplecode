package class26;

public interface TrustAble
    {
        public static final int age = 10;          // all variables created in interface are made final by default,
                                                  // and this applies on static and public as well.

       String color = "IHJKHJG";                  // we cannot set this variable as protected, private or default.

        int trust();                             // we cannot set any block of code (body) inside this interface abstract method.


        static void method1()
            {
                System.out.println("Hello world");
            }


        default void method2()
                {

                };
}




class Bank implements TrustAble
    {
        @Override
        public int trust() {
            return 0;
        }
    }
