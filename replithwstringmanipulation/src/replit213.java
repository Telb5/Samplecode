import java.util.Scanner;

public class replit213 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature in your city");
        int temperatureCheck = scanner.nextInt();
        if (temperatureCheck<32){
            System.out.println(new RuntimeException("It is freezing"));
        }
    }
}

//OR
/*class Main {
    public static void main(String[] args) {
        int temperature = 30;
        if (temperature < 32) {
            System.out.println(new RuntimeException("It is freezing"));
        }
    }

}*/






/*javac -classpath .:/run_dir/junit-4.12.jar:target/dependency/* -d . Main.java
 java -classpath .:/run_dir/junit-4.12.jar:target/dependency/* Main
java.lang.RuntimeException: It is freezing*/