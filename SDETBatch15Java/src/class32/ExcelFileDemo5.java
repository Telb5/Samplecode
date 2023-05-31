package class32;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileDemo5 {
    public static void main(String[] args) throws IOException {
        String path="Files/Book2.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        // I need to know the class that can handle the Excel file, this class is coming from Jars we imported yesterday and we will be using it
        XSSFWorkbook xssfWorkbook= new XSSFWorkbook(fileInputStream);
        // use methods from this class to read data easily from Excel Files.
        Sheet sheet2 = xssfWorkbook.getSheet("Sheet2");
        int noOfRows = sheet2.getPhysicalNumberOfRows();
        System.out.println(noOfRows);

        for(int i =0; i<noOfRows;i++){
            Row row= sheet2.getRow(i);

            System.out.println(row.getCell(0)+" "+row.getCell(1));


        }



    }
}