package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();

		// if you want to pass any input
		// driver.switchTo().alert().sendKeys("hello");

		driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();
	}
}
