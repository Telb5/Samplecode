package HW_02_28_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {

       WebDriver driver = new ChromeDriver();
       driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");


       WebElement textbox =  driver.findElement(By.xpath("//input[@id='sum1']"));
       textbox.sendKeys("SalamoAlaikum");


       WebElement showMessage = driver.findElement(By.xpath("//button[@onclick='showInput();']"));
       showMessage.click();


       WebElement enter_a = driver.findElement(By.xpath("//input[@id='sum1']"));
       enter_a.sendKeys("Abeera is a FREAK");


       WebElement enter_b = driver.findElement(By.xpath("//input[@id='sum2']"));
       enter_b.sendKeys("Hiral SIR");


       WebElement getTotal = driver.findElement(By.xpath("//button[@onclick='return total()']"));
       getTotal.click();
        System.out.println(getTotal.getText());


    }

}
