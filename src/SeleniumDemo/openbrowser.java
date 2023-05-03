package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/"); // To open the browser
	}

}
