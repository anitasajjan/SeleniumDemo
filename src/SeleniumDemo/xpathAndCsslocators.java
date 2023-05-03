package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAndCsslocators {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://w3schools.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@id='navbtn_tutorials']")).click();

		driver.findElement(By.xpath("//a[@href='/java/default.asp']")).click();

		// driver.findElement(By.xpath("//a[@title='Courses']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name='current-password']")).sendKeys("123");
		driver.findElement(
				By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']"))
				.click();

		// driver.quit();
	}
}
