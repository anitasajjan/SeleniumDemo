package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtablesHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		List<WebElement> amount = driver.findElements(By.xpath("(//table[@id='product'])[2]//tbody//tr//td[4]"));

		System.out.println(amount.size());
		int sum = 0;

		for (int i = 0; i < amount.size(); i++) {
			String p = amount.get(i).getText();
			int k = Integer.parseInt(p);
			sum = sum + k;
		}
		System.out.println(sum); // integer

		WebElement amountText = driver.findElement(By.xpath("//div[@class='totalAmount']"));

		String c = amountText.getText();
		System.out.println(c);

		String finalamount = c.substring(24); // string
		System.out.println(finalamount);

		System.out.println(String.valueOf(sum).equals(finalamount));
	}
}
