import java.util.Scanner;

public class replit97 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String browser = sc.nextLine();

        if (browser.equals("Chrome") || browser.equals("CHROME") || browser.equals("ChRoMe")) {
            System.out.println("Proceed with Chrome browser");
        } else if ((browser.equals("firefox") || browser.equals("FIREFOX") || browser.equals("FireFOX"))) {
            System.out.println("Proceed with Firefox browser");
        } else if ((browser.equals("IE") || browser.equals("ie") || browser.equals("iE"))) {
            System.out.println("Proceed with IE browser");
        } else {
            System.out.println("Invalid browser");
        }
    }
}
