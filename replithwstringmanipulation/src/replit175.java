public interface replit175 {

    /*
    Step1: Create Interface as FirstInterface and create undefined method as firstMethod (without parameter)

Step 2: Create another interface as SecondInterface in which create a method as secondMethod (Without Parameter)

Step 3: Inherit both interfaces to Main class.

Step 4: Execute both methods

**Expected Output:**

```
First Method implementing multiple Inheritance
Second Method implementing multiple Inheritance
```
     */

    public interface FirstInterface{
        void firstMethod();

    }

    public interface SecondInterface{
        void secondMethod();

    }

    public static void main(String[] args) {
        Mainpio method = new Mainpio();
        method.firstMethod();
        method.secondMethod();
    }

}


 class Mainpio implements replit175 {


     public void firstMethod() {
         System.out.println("First Method implementing multiple Inheritance");
     }

     public void secondMethod() {
         System.out.println("Second Method implementing multiple Inheritance");

     }

 }

