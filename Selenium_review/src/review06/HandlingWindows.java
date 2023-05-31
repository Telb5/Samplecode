package review06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class HandlingWindows {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.salesforce.com/au/");
        WebElement freeTrial = driver.findElement(By.xpath("//a[contains(@aria-label,'Start my free trial')]"));
        freeTrial.click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String id : windowHandles) {
            driver.switchTo().window(id);
            if (driver.getTitle().contains("Free CRM")) {
                driver.findElement(By.name("UserFirstName")).sendKeys("Dagobert");
                driver.findElement(By.name("UserLastName")).sendKeys("Duck");
            }
            driver.close();

        }
    }
}