package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();

		// Month
		String t = "";
		while (!(t.equals("July 2023"))) {
			driver.findElement(By.xpath("//a[@data-handler='next']")).click(); // This will click on next button
			WebElement month = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]"));
			t = month.getText(); // June 2023
			System.out.println(t);
		}
        
		//Date
		List<WebElement> obj = driver.findElements(By.xpath("//td[@data-month='6']"));
        
		for (WebElement k : obj) {

			if (k.getText().equalsIgnoreCase("16")) {
				k.click();
				break;
			}
		}
		
		/*for (int i = 0; i < obj.size(); i++) {
			if (obj.get(i).getText().equalsIgnoreCase("16")) {
				obj.get(i).click();
				break;

			}
		}*/
	}

}
