package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNGExample {
    public static WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public  void SetupBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

//      post condition to close the browser
    @AfterMethod(alwaysRun = true)
    public void closeBrowser() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }


//      test case 1
    //verify login functionality

    @Test(groups = "regression")
    public void loginFunctionality(){
        WebElement userName=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement login=driver.findElement(By.xpath("//*[@id='btnLogin']"));
        login.click();

    }


//  test case 2
//   verify that passsword textbox is displayed on the loginPage

    @Test
    public void passwordTextBoxCerification(){
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        System.out.println(password.isDisplayed());
    }
}

