package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesHandling {
	public static void main(String[] args) {
		WebDriver dragdrop = new ChromeDriver();
		dragdrop.get("https://jqueryui.com/droppable/");
		
		dragdrop.manage().window().maximize();
		
		// we can switch to frame- id or name,xpath and index

		// switch the control inside the frame
		WebElement b = dragdrop.findElement(By.xpath("//iframe[@class='demo-frame']"));
		dragdrop.switchTo().frame(b);

		Actions a = new Actions(dragdrop);
		WebElement source = dragdrop.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = dragdrop.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(source, target).build().perform();
		dragdrop.quit();
		
        WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		// SWITCH TO LEFT---> TOP---LEFT
		WebElement top = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(top);

		WebElement left = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(left);

		WebElement leftText = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
		System.out.println(leftText.getText());

		// SWITCH TO MIDDLE--> TOP--MIDDLE
		driver.switchTo().parentFrame();

		WebElement middle = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(middle);

		WebElement middletext = driver.findElement(By.xpath("//div[@id='content']"));
		System.out.println(middletext.getText());

		// SWITCH TO RIGHT--> TOP--RIGHT
		driver.switchTo().parentFrame();

		WebElement right = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		driver.switchTo().frame(right);

		WebElement righttext = driver.findElement(By.xpath("//body[contains (text(),'RIGHT')]"));
		System.out.println(righttext.getText());

		// SWICH TO BOTTOM--> DEFAULT--BOTTOM
		driver.switchTo().defaultContent();

		WebElement bottom = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(bottom);

		WebElement bottomtext = driver.findElement(By.xpath("//body[contains (text(),'BOTTOM')]"));
		System.out.println(bottomtext.getText());

	}
}
