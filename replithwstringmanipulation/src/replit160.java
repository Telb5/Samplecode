public class replit160 {


    public void display(int x)
        {
            System.out.println(x);
        }


        public void display(String y)
            {
                System.out.println(y);
            }


            public void display(double a)
                {
                    System.out.println(a);
                }
}



class MMMain
    {
        public static void main(String[] args) {
            replit160 print = new replit160();
            print.display(100);
            print.display("Syntax Technologies");
            print.display(100.09);
        }
    }






/*For you to do:

Overload instance method display by having different types of parameters

Inside each method write the logic to print value of the parameter.

Call all methods inside your main method.

**Expected Output:**

```
100
```

```
Syntax Technologies
```

```
100.09
```*/
