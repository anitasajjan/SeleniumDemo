package SeleniumDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelHandlingEmployeeCount {
	public static void main(String[] args) throws IOException {

		  // Read the excel file--
		  FileInputStream fs = new FileInputStream("C:\\Users\\91954\\OneDrive\\Desktop\\ExcelHandling_Selenium.xlsx");

		  // This will take control of our excel file--
		  XSSFWorkbook workbook = new XSSFWorkbook(fs);

		  // This will take the control sheet
		  XSSFSheet sheet1 = workbook.getSheet("Sheet2");

		  // This will take the control of our row 1 from sheet 1
		  Row row1 = sheet1.getRow(0);

		  //
		  Cell cell1 = row1.getCell(0);

		  System.out.println(cell1);

		  // write into excel

		  String path = "C:\\Users\\91954\\OneDrive\\Desktop\\ExcelHandling_Selenium.xlsx";
		  FileInputStream fs1 = new FileInputStream(path);

		  Workbook wb = new XSSFWorkbook(fs1);
		  // sheet
		  Sheet sheet2write = wb.getSheetAt(1);

		  int lastRow = sheet2write.getLastRowNum();
		  System.out.println(lastRow);

		  
		    Row row=null;
		    Cell cell=null;
		  for (int i = 1; i <= lastRow; i++) {

		   try {
		       row = sheet2write.getRow(i); // 0
		    cell = row.createCell(1);   //1
		    cell.setCellValue("10");
		   } catch (Exception e) {
		    cell = row.createCell(1); 
		    cell.setCellValue("0");
		    
		   }

		  }
		  FileOutputStream fos = new FileOutputStream(path);
		  wb.write(fos);
		  fos.close();
}
}
