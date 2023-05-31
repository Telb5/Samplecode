public class replit165 {

    /*Parent class create 4 methods with different level of access modifiers.
    In each method print "I am parent public/protected/default/private method".

Override methods in child class

In Main Class create object of the child class and see which methods are available

**Expected Output:**

```
I am a child public method
```

```
I am a child protected method
```

```
I am a child default method*/

    public void method10()
        {
            System.out.println("I am parent public");
        }

    protected void method11()
    {
        System.out.println("I am parent protected");
    }

     void method12()
    {
        System.out.println("I am parent default");
    }


    private void method13()
    {
        System.out.println("I am parent private");
    }
}


class subchild extends replit165
    {
        public void method10()
        {
            System.out.println("I am child public method");
        }

        protected void method11()
        {
            System.out.println("I am child protected method");
        }

        void method12()
        {
            System.out.println("I am child default method");
        }

        private void method13()
        {
            System.out.println("I am child private method");
        }

    }


class MaIn
    {
        public static void main(String[] args) {
            subchild print = new subchild();
            print.method10();
            print.method11();
            print.method12();
        //    print.method13();
        }
    }