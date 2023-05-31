package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

    public class jsExecutor {
        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            //        create an instance of WebDriver
            WebDriver driver = new ChromeDriver();
//        max the window
            driver.manage().window().maximize();
            //goto :
            driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//        find the webEelment username
            WebElement username = driver.findElement(By.id("txtUsername"));
            username.sendKeys("Admin");

//        to highlight the username box

//        1. declare isntance
            JavascriptExecutor js = (JavascriptExecutor) driver;
//        2.execute script
//        arguments[0].style.border='10px dotted pink'"    draw a box
            ////"arguments[0].style.border='3px solid black'" // we get this code from google all the fucking time.
            js.executeScript("arguments[0].style.border='5px dotted blue'", username);


//        find the WebElement
            WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//        click the login button
            js.executeScript("arguments[0].click();",loginBtn);

        }}