package justtestingthings;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.border.TitledBorder;
import java.util.List;
import java.util.Set;

public class tesssssst {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1694835125%3A1679758541604189&continue=https%3A%2F%2Fwww.google.com%2Fwebhp%3Fhl%3Den%26sa%3DX%26ved%3D0ahUKEwiy2viUtPf9AhUIlmoFHVsZBzAQPAgJ&ec=GAZAmgQ&hl=en&ifkv=AQMjQ7TlU95FjzSvERld-Js0FYY2-LTM1NWVRYkG73_KH-RKCcBc0208anKywVPDvWGIAZNMwfOBEA&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        String parentWindow = driver.getWindowHandle();


        Set<String> windowHandles = driver.getWindowHandles();
        for (String allWindows:windowHandles) {
           driver.switchTo().window(allWindows);
          String title = driver.getTitle();
           if (title.equals("Privacy Policy – Privacy & Terms – Google"));
           driver.switchTo().window(title);
            break;
        }
        System.out.println(driver.getTitle());

        /*for (String windowHandlesALL : windowHandles) {
            String titleHandle = driver.getTitle();
            if (titleHandle.equalsIgnoreCase("https://support.google.com/accounts?hl=en&visit_id=638153550918847684-3774323207&rd=2&p=account_iph#topic=3382296")) ;
            driver.switchTo().window("https://support.google.com/accounts?hl=en&visit_id=638153551616119747-4062091286&rd=2&p=account_iph#topic=3382296");
            break;
*/



    }
}
























       /* driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        alert.accept();*/








       /* String parenWindow = driver.getWindowHandle();
        System.out.println(parenWindow);


        Set<String> links = driver.getWindowHandles();
        for (String link:links){
            driver.switchTo().window(link);
            String title= driver.getTitle();
            if (title.equals("Syntax - Website to practice Syntax Automation Platform ")){
                break;
            }
        }
        driver.switchTo().window(parenWindow);*/

