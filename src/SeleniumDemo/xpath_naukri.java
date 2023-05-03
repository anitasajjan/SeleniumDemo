package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_naukri {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//small[@class='fs11']")).click();

		// Forgot Password page
		driver.findElement(By.xpath("//label[@for='resetvia-email']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("anitasajjan@gmail.com");
		driver.findElement(By.xpath("//button[@class='inline-items waves-effect waves-light btn blue-btn']")).click();

		driver.findElement(
				By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn']")).click();
		driver.findElement(By.xpath("//em[@class='icon']")).click();

	}
}
