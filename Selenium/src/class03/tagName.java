package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {


    public static void main(String[] args)  {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        // create an instance of webDriver
        WebDriver driver = new ChromeDriver();

        // maximize the window
        driver.manage().window().maximize();

        // open the Website fb
        driver.get("https://www.amazon.com/");

        // to get all links
        //we know that all links are in tag <a> which is also called another tag
        //lets use the locator by tagName for this purpose

        List<WebElement> tags = driver.findElements(By.tagName("a"));
        // in order to


    }}
