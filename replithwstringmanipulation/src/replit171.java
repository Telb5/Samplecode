public abstract class replit171
    {




     /*   Create a Parent Class that will have two overloaded abstract methods m1

        Make Main class as concrete subclass to Parent Class

            In main method call the methods.

            **Expected Output:**

            ```
        m1 without parameters
        m1 method with parameter
```
*/

        abstract void m1();
        abstract void m1(String x, String y);

    }



class Maaaaiin{

    void m1() {
        System.out.println("m1 without parameters");
    }


    void m1(String x, String y) {
        System.out.println("m1 method with parameter");
    }



    public static void main(String[] args) {
        Maaaaiin print = new Maaaaiin();
        print.m1();
        print.m1("r", "rt");
    }
}
