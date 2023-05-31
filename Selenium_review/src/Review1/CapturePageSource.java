package Review1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturePageSource {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com/");
        String pageSource = driver.getPageSource();
        System.out.println("The title of the page is " + pageSource);

    }
}
