public abstract class replit173 {


   /* Create a Super Class Tea that will have:

- instance variable teaType;
- constructor that will initialize
- unimplemented method addSugar(),

Create 2 subclasses of Tea as Lemon Tea and Chai Tea.

In main class create an object of 2 Child and assign them to Parent reference type.

Execute method addSugar from both classes.

**Expected Output:**

For Lemon Tea we need 2 spoons of sugar

For Chai Tea we need 1 spoon of sugar

*/

    String teatype;

    replit173(String teatype) {
        this.teatype = teatype;
    }


    abstract void addSugar();


    void fly() {
        System.out.println("fly please");
    }


}


class LemonTea extends replit173{

    LemonTea(String teatype) {
        super(teatype);
    }

     void addSugar(){
        System.out.println("For "+teatype+ " we need 2 spoons of sugar");
    }
}



 class ChaiTea extends replit173 {

    ChaiTea(String teatype) {
        super(teatype);
    }

    void addSugar() {
        System.out.println("For " + teatype + " we need 1 spoon of sugar");
    }

}

class Maaaaaaain{

    public static void main(String[] args) {
       replit173[] array = {new LemonTea("Lemon Tea"), new ChaiTea("Chai Tea")};

        for (replit173 arr:array) {
            arr.addSugar();


        }
  }
}
