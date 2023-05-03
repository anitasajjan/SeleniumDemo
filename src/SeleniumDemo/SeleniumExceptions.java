package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class SeleniumExceptions {
	public static void main(String[] args) {
		// https://www.thepsi.com/what-are-the-common-selenium-exceptions-and-how-to-handle-them/

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");

		WebElement a = driver.findElement(By.id("username"));
		a.sendKeys("test1");

		WebElement b = driver.findElement(By.name("pw"));
		b.sendKeys("test123");

		driver.navigate().refresh();

		try {
			a.sendKeys("test1");

		} catch (Exception e) {
			a = driver.findElement(By.id("username"));
			a.sendKeys("test1");

		}

		// Fluent wait
		FluentWait<WebDriver> wait2 = new FluentWait<WebDriver>(driver);

		wait2.withTimeout(Duration.ofSeconds(30)); // Specify the timout of the wait
		wait2.pollingEvery(Duration.ofSeconds(6)); // Sepcify polling time

		// This is how we specify the condition to wait on.
		wait2.until(ExpectedConditions.alertIsPresent());
	}
}
