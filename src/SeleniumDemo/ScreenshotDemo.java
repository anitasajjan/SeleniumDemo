package SeleniumDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0

		// taking full screenshots
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\91954\\OneDrive\\Desktop\\screenshot\\test1.png"));

		// taking partial screenshot
		WebElement b = driver.findElement(By.xpath("//input[@id='name']"));
		File src1 = b.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("C:\\Users\\91954\\OneDrive\\Desktop\\screenshot\\screenshot1.png"));
	}
}
