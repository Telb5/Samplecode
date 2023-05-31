package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

    public static void main(String[] args) throws InterruptedException {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");


        // create an instance of webDriver
        WebDriver driver = new ChromeDriver();


        // open the Website fb
        driver.get("https://www.facebook.com/");


        // send in the username
        driver.findElement(By.id("email")).sendKeys("moazzam");

        // send the password
        // note : copy the element because it is key sensitive and there is no chance to fuck it up
        driver.findElement(By.name("pass")).sendKeys("abracdabra");

        //driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.partialLinkText("password")).click();

    }
}
