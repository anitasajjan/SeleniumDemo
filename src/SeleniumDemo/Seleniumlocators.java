package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Seleniumlocators {

	/*8 different locators
	id
	classname
	name
	tagname
	xpath
	css
	linktext
	partial link text*/
	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("test");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		driver.findElement(By.xpath("//input[@name='cancel']")).click();
		
	}
}
