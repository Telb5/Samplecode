public class replit210 {

    public static void main(String[] args) {

        try {
            int a = 10, b = 0, result;

            result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {

            System.out.println("/ by zero");

        }
    }
}