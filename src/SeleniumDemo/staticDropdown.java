package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		WebElement a = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select s = new Select(a);
		s.selectByIndex(2);
		s.selectByValue("USD");
		s.selectByVisibleText("AED");

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);

		// Adult
		for (int i = 0; i < 9; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		Thread.sleep(2000);

		// accepting alert
		driver.switchTo().alert().accept();

		/*
		 * // Child for (int i = 0; i < 3; i++) {
		 * driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click(); }
		 */

		Thread.sleep(2000);
		// Infant
		for (int i = 0; i < 2; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
		}

		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

	}
}
