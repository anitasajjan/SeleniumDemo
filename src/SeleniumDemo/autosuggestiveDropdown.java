package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestiveDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		WebElement a = driver.findElement(By.xpath("//input[@id='autosuggest']"));
		a.sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> b = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		System.out.println(b.size());

		for (int i = 0; i < b.size(); i++) {
			if (b.get(i).getText().equalsIgnoreCase("India"))
			{
				b.get(i).click();
			}
		}
		/*
		 * //for each loop for(WebElement k:b) {
		 * if(k.getText().equalsIgnoreCase("India")) {
		 *  k.click(); break; 
		 *  } 
		 *  }
		 */

	}
}
