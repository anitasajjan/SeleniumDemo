package SeleniumDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelHandling {
	public static void main(String[] args) throws IOException {
		// Read the excel file
		FileInputStream fs = new FileInputStream("C:\\Users\\91954\\OneDrive\\Desktop\\ExcelHandling_Selenium.xlsx");

		// This will take control of our excel file
		XSSFWorkbook workbook = new XSSFWorkbook(fs);

		// This will take control of sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// This will take control of row1 from sheet1
		Row row1 = sheet.getRow(1);

		// This will take control of cell1 from sheet1
		Cell cell1 = row1.getCell(0);
		String username = cell1.toString();

		Cell cell2 = row1.getCell(1);
		String password = cell2.toString();

		System.out.println(cell1);
		System.out.println(cell2);

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");

		WebElement a = driver.findElement(By.xpath("//input[@type='email']"));
		a.sendKeys(username);

		WebElement b = driver.findElement(By.xpath("//input[@type='password']"));
		b.sendKeys(password);

	}
}
