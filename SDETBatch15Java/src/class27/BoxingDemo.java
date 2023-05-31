package class27;

import javax.swing.*;

public class BoxingDemo {
    public static void main(String[] args) {

        int number = 15;
        printData(number);


        Integer f =10;  //autoboxing
        int number2 = f;


    }

    public static void printData(Integer number){
        System.out.println(number);
    }
}
