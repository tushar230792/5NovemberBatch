package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ddrop {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange']) [4]"));
		
		
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder']) [4]"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(5000);
		
		act.dragAndDrop(source, destination).perform();
		
		
		

}
}
