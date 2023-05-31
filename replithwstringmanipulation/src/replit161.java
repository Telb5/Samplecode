public class replit161 {

    /*Overload private instance method m1

Call each method from the main method.



Expected Output:

```
private m1 method
private m1 method with int parameter
*/


    private void m1()
        {
            System.out.println("private m1 method");
        }


        private void m1(int x)
            {
                System.out.println("private m1 method with int parameter");
            }



        public static void main(String[] args) {
            replit161 print = new replit161();
            print.m1();
            print.m1(1);
        }
    }


