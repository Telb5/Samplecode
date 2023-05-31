package class21;

public class Calculator_Tester {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.add(10,10); // by defining only 2 int, then we will call the first method in our calculator class that contains the same parameters.
        calculator.add(10,10,20); // by defining 3 int, then we will call the second method in our calculator class that contains the same parameters.
        calculator.add(10,9.9); // by defining int and double, then we will call the third method in our calculator class that contains the same parameters.
    }
}
