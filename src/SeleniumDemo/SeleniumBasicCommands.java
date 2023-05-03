package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumBasicCommands {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://w3schools.com/"); //To open the browser
	
	driver.manage().window().maximize();  //to maximize the window
	
	System.out.println(driver.getCurrentUrl());   // to print current url
	
	System.out.println(driver.getTitle());  //to print page title
	
	driver.navigate().back();  //navigates back
	
	Thread.sleep(4000);
	
	driver.navigate().forward();  //navigates forward
	
	driver.navigate().refresh();  //to refresh the page
	
	driver.close();
	
}
}
