package Review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CaptureUrl {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        String pageUrl = driver.getCurrentUrl();
        System.out.println("The title of the page is " + pageUrl);
    }
}
