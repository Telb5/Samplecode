package class21;

public class Animal {

    String name;
    String color = "Black";

}


class Cat extends Animal{
    String color = "white";  // instance variable      // if we delet this line and line number 18 then Java will print Black to all the print on lines num 19, 29 and 21
    int age = 10;   // instance variable
    double weight;     // instance variable


    void printcolor(){
        String color = "Blue";            //local variable
        System.out.println(color);        //output will be blue
      //System.out.println(this.color);   //output will be white
      //System.out.println(super.color);  //output will be black

        // when we use super key word, we directly call the parent class.

    }
}

//———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
class AnimalTester{
    public static void main(String[] args) {

        Cat cat = new Cat();  // if we call cat, then it will take color from the second class "white" instead of "black", so if we want use
        // super key word to call line number 6, it won't be possible because super only works within child class
        cat.printcolor();
    }
}
