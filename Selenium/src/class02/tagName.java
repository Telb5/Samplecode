package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {

    public static void main(String[] args)  {
        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");


        // create an instance of webDriver
        WebDriver driver = new ChromeDriver();


        // open the Website fb
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");


        //find username
       WebElement username = driver.findElement(By.xpath("//input[contains(@name, 'username')]"));
       username.sendKeys("Tester");


        //find the password field
         driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("test");


         // to th text username which is beside the username text box
         WebElement usernameText = driver.findElement(By.xpath("//label[text()= 'Username:']"));
        System.out.println(usernameText.getText());

        // to get the text which i beside the password text box
        WebElement passwordText = driver.findElement(By.xpath("//label[text()= 'Password:']"));
        String passText = passwordText.getText();
        System.out.println(passText);



    }}
