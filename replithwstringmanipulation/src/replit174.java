public interface replit174 {
    /*
    Create an Interface with name as MyInterface

Create two undefined methods method1 and method2

Inherit the MyInterface to Main Class.

Execute both methods

**Expected Output:**

```
implementation of method1
```

```
implementation of method2
```
     */

        void m1();

        void m2();

    }

    class Main2 implements replit174 {
        @Override
        public void m1() {
            System.out.println("implementation of method1");
        }

        @Override
        public void m2() {
            System.out.println("implementation of method2");


    }


        public static void main(String[] args) {
            Main2 interface1 = new Main2();
            interface1.m1();
            interface1.m2();



        }
    }

