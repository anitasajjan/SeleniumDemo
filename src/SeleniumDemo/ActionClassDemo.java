
package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		WebElement b = driver.findElement(By.xpath("//button[@id='openwindow']"));
		WebElement c = driver.findElement(By.xpath("//button[@id='mousehover']"));
		Actions a = new Actions(driver);
		a.contextClick(b).perform();  //right click
		//a.doubleClick(b).perform();  //double click
		a.moveToElement(c).perform(); //mousehover

	}
}
