package SeleniumDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelSheetpractice {
	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\91954\\OneDrive\\Desktop\\ExcelHandling_Selenium.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		Row row = null;
	    Cell cell= null;
		
		System.out.println(sheet.getLastRowNum());
		for(int i=0;i<=sheet.getLastRowNum();i++) {
		     
		    row = sheet.getRow(i);
		     
		    System.out.println(row);
		    
		    }
	}
}
