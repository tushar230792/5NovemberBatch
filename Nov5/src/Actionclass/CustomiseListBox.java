package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomiseListBox {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		Actions act=new Actions (driver);
		
//		act.moveToElement(login).perform();   //moving Angular brace to login element
//		
//		driver.findElement(By.xpath("//div[text()='Orders']"));
//		
//		act.click().perform();
//		
		act.contextClick(login).perform();
		
		
	}

}
