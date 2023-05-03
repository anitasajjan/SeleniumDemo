package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinks {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	  driver.get("https://login.salesforce.com/?locale=in");
	  driver.manage().window().maximize();
	  
	  List<WebElement> a=driver.findElements(By.tagName("a"));
	 
	  System.out.println("Total links=" +a.size());  
	  
	  for(WebElement b:a) {
	   System.out.println(b.getAttribute("href"));
	  }
	  
	  
	  //for loop
	  
	  /*for(int i=0;i<a.size();i++) {

	   System.out.println(a.get(i).getText());
	   
	  }*/
	  
}
}
