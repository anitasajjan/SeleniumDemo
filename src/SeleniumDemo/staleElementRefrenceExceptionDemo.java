package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleElementRefrenceExceptionDemo {

	// https://www.thepsi.com/what-are-the-common-selenium-exceptions-and-how-to-handle-them/
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");

		WebElement a = driver.findElement(By.id("username"));
		a.sendKeys("test1");

		WebElement b = driver.findElement(By.name("pw"));
		b.sendKeys("test123");

		driver.navigate().refresh();

		// a.sendKeys("test1");

		try {
			a.sendKeys("test1");

		} catch (Exception e) {
			a = driver.findElement(By.id("username"));
			a.sendKeys("test1");

		}

	}
}
