package SeleniumDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//button[@id='openwindow']")).click();

		System.out.println(driver.getCurrentUrl());

		// This is collection
		Set<String> obj = driver.getWindowHandles();
		// parent window
		// child window

		// i need to apply the iterator

		Iterator<String> it = obj.iterator();

		String parent_Window = it.next();
		String child_winodw = it.next();

		driver.switchTo().window(child_winodw);

		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(parent_Window);

	}
}
