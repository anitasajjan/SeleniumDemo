package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath_practice {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='/nlogin/forgotpassword']")).click();
		Thread.sleep(2000);

		// Forgot password page
		driver.findElement(By.xpath("//label[@for='resetvia-username']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("anitasajjan@gmail.com");
		driver.findElement(By.xpath("//button[@class='inline-items waves-effect waves-light btn blue-btn']")).click();

		// driver.findElement(By.xpath("//em[@class='icon']")).click();
		// driver.findElement(By.xpath("//input[@id='otpField']")).sendKeys("123");

	}
}
