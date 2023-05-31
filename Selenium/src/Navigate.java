import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");


        // create an instance of webDriver
        WebDriver driver = new ChromeDriver();

        // open google.com
        driver.get("https://www.google.com/");

        //  slow down
        Thread.sleep(2000);

        //  now navigate to Facebook.com
        driver.navigate().to("https://www.facebook.com/");

        //  slow down
        Thread.sleep(2000);

        // go back
        driver.navigate().back();

        // go to Facebook
        driver.navigate().forward();

        //  slow down
        Thread.sleep(2000);


        // refresh the page
        driver.navigate().refresh();


        // to close the browser
        driver.quit();
    }
}

