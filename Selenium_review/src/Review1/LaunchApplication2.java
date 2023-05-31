package Review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.lang.reflect.Array;

public class LaunchApplication2 {

    public static void main(String[] args) {

        //The next 3 lines of code are for the case in which our latest Sel or Java won't be able to open our browser.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);



        driver.get("https://itera-qa.azurewebsites.net/home/automation/");
        driver.findElement(By.xpath("//input[@id='monday']"));
    }
}
