package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		// To select single radio button
		// driver.findElement(By.xpath("//input[@value='radio1']")).click();

		// To select multiple radio buttons
		List<WebElement> a = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(a.size());
		
		for(int i=0;i<a.size();i++)
		{
			a.get(i).click();
			//Thread.sleep(2000);
		}
	}

}
