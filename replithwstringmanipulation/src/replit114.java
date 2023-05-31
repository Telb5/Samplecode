public class replit114 {

    public static void main(String[] args) {

        replit114 methode = new replit114();

        System.out.println("Addition "+(methode.method1(15, 15)));
        System.out.println("Subtraction "+(methode.method2(10, 3)));
        System.out.println("Subtraction "+(methode.method3( 200, 10)));
    }

   /* Step1: Create three methods that will accept 2 in parameters on integer type

    Step2: Write the logic in methods to perform actions below:

    The first method for multiplication

    The second method for addition

    The third method for subtraction

    Step3: execute all methods

1. for the addition method add two numbers to make 30

            2. for multiplication multiply two numbers to make 30

            3. for Subtraction subtract two numbers to equal 20

            **Expected Output:**

            ```
    Addition 30
            ```

            ```
    Multiplication 30/*




    */

    int method1(int x, int y){
    return x+y;
}

   int method2(int x, int y){
    return x*y;
    }

    int method3(int x, int y){
        return x/y;
    }
}