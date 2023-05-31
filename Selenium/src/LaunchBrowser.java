
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.sql.SQLOutput;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");


        // create an instance of webDriver
        WebDriver driver = new ChromeDriver();


        // open the Website google.com
        driver.get("https://www.facebook.com/");


        //get the current url that is there in the browser.
        String URL = driver.getCurrentUrl();
        // print out the url.
        System.out.println(URL);


        // get the title of the webpage.
         String title=driver.getTitle();
        System.out.println("The title of the page is " + title);

        // this to tell the browser 3 seconds (as example) before it closes.
        Thread.sleep(3000);

        // close the browser.
        driver.quit();



    }
}