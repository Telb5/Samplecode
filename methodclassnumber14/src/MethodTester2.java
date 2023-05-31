public class MethodTester2 {
    public static void main(String[] args) {

        //++ if we want to use the method from the other class (blueprint), we need to
        //++ call the class name, varibale name... (below example).

        //++We call this creating an object of the class

        MethodsDemo2 md = new MethodsDemo2();
      //  md.printHello();  // calling a method



       // md.printHelloManyTimes(15);  // calling a method




        md.printManyTimes(5, "I love Java");
    }
}