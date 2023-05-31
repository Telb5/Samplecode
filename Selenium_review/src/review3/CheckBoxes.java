package review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {

        //The next 3 lines of code are for the case in which our latest Sel or Java won't be able to open our browser.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://itera-qa.azurewebsites.net/home/automation/");
        List<WebElement> days = driver.findElements(By.xpath("//input[@type ='checkbox' and contains(@id,'day')]"));
        //or
        //List<WebElement> days =  driver.findElements(By.xpath("//input[@class ='form-check-input'and@type='checkbox']"));


        //enhanced loop

        /*for(WebElement day : days)
        {
            day.click();*/

        // OR normal loop

       /* for (int i = 0; i < days.size(); i++) {
            days.get(i).click();
        }*/







        // now if we want to check Tuesday, thursday and SAturday

        // for (WebElement day : days) {
        //            if(day.getAttribute("id").equalsIgnoreCase("tuesday")
        //            day.getAttribute("id").equalsIgnoreCase("thursday")
        //            day.getAttribute("id").equalsIgnoreCase("saturday")) {
        //                day.click();
        //            }


        //OR
        //normal for loop

        for (int i = 0; i < days.size(); i++) {
            String day = days.get(i).getAttribute("id");
            if (day.equals("Tuesday") || day.equals("Thursday") || day.equals("Saturday")) {
                days.get(i).click();
            }

        }
    }
}