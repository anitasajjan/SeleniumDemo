package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// implict wait -- We need to declare it globally
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.xpath("//a[@value='BOM']")).click();

		// WebElement -- driver.findElement(By.xpath)

		// locator-- By.xpath("");

		// Explict Wait

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath1"))).click();

		// xpath1--unstable

		// xpath2--stable

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath3"))).click();

		// xpath3 --ubstable
		// xpath4--stable

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(25));

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath5"))).click();

		// xpath 5 -- unstable --25

	}
}
