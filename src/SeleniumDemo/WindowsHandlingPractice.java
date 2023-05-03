package SeleniumDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//span[@class='acceptance-btn-text']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='MNC']")).click();

		Set<String> obj = driver.getWindowHandles();

		Iterator<String> it = obj.iterator();

		String parent_window = it.next();
		String child_window = it.next();

		driver.switchTo().window(child_window);
		Thread.sleep(8000);

		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[@data-title='International Jobs In Bangalore']")).click();

		Set<String> obj1 = driver.getWindowHandles();
		Iterator<String> it1 = obj1.iterator();

		String tab_1 = it1.next();
		String tab_2 = it1.next();
		String tab_3 = it1.next();

		driver.switchTo().window(tab_3);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Hiring For International BPO ( Voice Process)']")).click();
		Set<String> obj2 = driver.getWindowHandles();

		Iterator<String> it2 = obj2.iterator();
		String tab1 = it2.next();
		String tab2 = it2.next();
		String tab3 = it2.next();
		String tab4 = it2.next();

		driver.switchTo().window(tab4);
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(tab1);
		System.out.println(driver.getCurrentUrl());
	}

}
