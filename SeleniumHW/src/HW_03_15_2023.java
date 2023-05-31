/*please do this HW
it is needed to be done before class on saturday
i request everyone to Attempt it as this will help u alot in working with tables and calenders.

1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login

username=Admin
password=Hum@nhrm123

2. click on PIM option
3. from the table select Any  value of id and click the check box associated with it

make sure that ur code is dynamic i.e
changing the id doesnt effect the logic or xpath*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class HW_03_15_2023 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewEmployeeList");


        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button']"));
        loginButton.click();

       List<WebElement> column = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[3]"));

        for (int i = 0; i < column.size(); i++) {
           String text = column.get(i).getText();
            if(text.equalsIgnoreCase("Amitabh ms")){
                System.out.println(text);

            }
        }





    }
}