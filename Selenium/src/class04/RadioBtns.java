package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php%22");

                //click on male
                WebElement mBtn=driver.findElement(By.cssSelector("input[value='Male']"));
        mBtn.click();
        //check if the radio button is enabled
        boolean isEnabledMale=mBtn.isEnabled();
        System.out.println("the radio button male is enabled "+isEnabledMale);
        boolean isMaleDisplayed=mBtn.isDisplayed();
        System.out.println(isMaleDisplayed);
        boolean isMaleSelected=mBtn.isSelected();
        System.out.println(isMaleSelected);

        if (!isMaleSelected){
            mBtn.click();
        }
        isMaleSelected=mBtn.isSelected();
        System.out.println("the status of selection is "+isMaleSelected);
    }
}