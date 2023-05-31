import jdk.dynalink.beans.StaticClass;

public class replit115 {

     String uppercase(String x){

        return x.toUpperCase();

    }

    public static void main(String[] args) {

        replit115 test = new replit115();

        System.out.println(test.uppercase("Test"));

        /*Create a method that will accept a String as a parameter and return new String all in upper case
            //    Call method
**Expected Output:**
        TEST*/



    }
}
