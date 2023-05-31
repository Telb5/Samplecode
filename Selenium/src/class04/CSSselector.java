package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector{

        public static void main(String[] args) throws InterruptedException {
            // tell your project where the webdriver is located.
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

            // create an instance of webDriver
            WebDriver driver = new ChromeDriver();

            // maximize the window
            driver.manage().window().maximize();

            // open the Website fb
            driver.get("https://www.facebook.com/");

            //click on the button account using cs elector
            WebElement createNewBtn= driver.findElement((By.cssSelector("a[data-testid = 'open-registration-form-button']")));

            createNewBtn.click();

            //sleep
            Thread.sleep(2000);

            // fill in the firstname
            WebElement firstName = driver.findElement(By.cssSelector("input[name= 'firstname']"));
            firstName.sendKeys("abracadabra");

        }
}
