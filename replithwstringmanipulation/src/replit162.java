public class replit162 {

    /*Overload static method and then execute both overloaded methods.

**Expected Output:**

```
static method without parameter
static method with int parameter
*/


    static void display()
        {
            System.out.println("static method without parameter");
        }


    static void display(int r)
        {
            System.out.println("static method with int parameter");
        }

}


class Maaaaain
    {
        public static void main(String[] args) {
            replit162.display();
            replit162.display(1);
        }
    }
