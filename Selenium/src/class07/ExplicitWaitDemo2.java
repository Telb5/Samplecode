package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo2 {
    public static void main(String[] args) {


        //        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

//        click on alert button
                driver.findElement(By.xpath("//button[@id='alert']")).click();



//      wait until the alert is present
//      for selenium 4 only,
//         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//      OR we use below if higher version
      WebDriverWait wait= new WebDriverWait(driver,20);


        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();



    }
}