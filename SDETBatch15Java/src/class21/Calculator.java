package class21;

public class Calculator {

    void add(int num1, int num2) {
        System.out.println(num1+num2);

    }

    void add(int num1, int num2, int num3) {
        System.out.println(num1+num2);

    }


    void add(int num1, double num2) {   // we only changed the second datatype compared to the first method, to perform the method overloading
        System.out.print(num1+num2);
    }


    void add(double num2, int num1) {    // we only changed the order of parameters compared to the method above this one.
        System.out.print(num1+num2);
    }

}
