package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		// To select single check box 
		WebElement a = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		a.click();

		/*
		 * // To select multiple checkbox List<WebElement> b =
		 * driver.findElements(By.xpath("//input[@type='checkbox']"));
		 * System.out.println(b.size()); // prints number of checkboxes
		 * 
		 * for (int i = 0; i < b.size(); i++) { b.get(i).click(); }
		 */

		/*
		 * // To select alternative checkbox List<WebElement> c =
		 * driver.findElements(By.xpath("//input[@type='checkbox']")); for (int i = 0; i
		 * < c.size(); i++) { System.out.println("Even =" +i % 2); if (i % 2 == 0) {
		 * 
		 * c.get(i).click(); }
		 * 
		 * }
		 */
		// checkbox methods
		System.out.println(a.isDisplayed());  //true
		System.out.println(a.isEnabled());    //true
		System.out.println(a.isSelected());   //true
		/*
		 * for(WebElement k:c) { k.click(); }
		 */
	}
}
