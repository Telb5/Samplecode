package class07;

import org.apache.poi.ss.formula.functions.Rows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableSample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();


//       Task: 1
//       get the whole table acceessed and orint it on the console
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        String table_Data = table.getText();
        System.out.println(table_Data);


//      Task: 2
//      get the rows of the table and print them
        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        for (WebElement row : Rows) {
//            extract text from each row
            String row_text = row.getText();
            if (row_text.contains("Google")) {
                System.out.println(row_text);


            }
        }


//      Task: 3
//      Column level access
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:columns) {
            System.out.println(column.getText());
        }



//        task 4: just print the first column of every row
        List<WebElement> first_columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for(WebElement first_col:first_columns){
            System.out.println(first_col.getText());
        }

    }
}