package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://www.facebook.com/reg/");
		
		System.out.println(driver.getWindowHandle());
		
	driver.findElement(By.linkText("Meta Pay")).click();
	
	System.out.println(driver.getWindowHandles());
	
	Set<String> ma = driver.getWindowHandles();
	
	ArrayList<String> sa=new ArrayList<String>(ma);
	
	driver.switchTo().window(sa.get(1));
	
	Thread.sleep(5000);
	
	driver.findElement(By.linkText("Getting Started")).click();
	}

}
