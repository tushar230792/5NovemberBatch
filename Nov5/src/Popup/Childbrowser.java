package Popup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // upcasting
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
     	 Set<String> id = driver.getWindowHandles();
     	 
     //	 System.out.println(id);
		 
		ArrayList<String> al=new ArrayList<String>(id);
		
		String cbadd = al.get(1);
		
		driver.switchTo().window(cbadd);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//a[@class='bmc-btn']")).click();
		
	//	Thread.sleep(3000);
		
	//	driver.navigate().back();
		
	//	driver.findElement(By.xpath("(//span[text()='WebdriverIO'])[1]")).click();
		
	//	driver.switchTo().window(al.get(0));
}
}
