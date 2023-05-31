public class replit163 {


    /*
    In Parent Class create a method with name method() that will print  "Parent method"

Override method() in Child class that will print "Child method"

In Main Class create objects of child and parent class and call its method.

**Expected Output:**

```
Parent method
Child method
     */


    public void method()
        {
            System.out.println("Parent method");
        }

}


class Childda extends replit162
    {
        public void method()
        {
            System.out.println("Child method");
        }
    }


class Mailn
    {
        public static void main(String[] args) {

            replit163 print = new replit163();
          print.method();
            Childda c = new Childda();
            c.method();
        }
    }
