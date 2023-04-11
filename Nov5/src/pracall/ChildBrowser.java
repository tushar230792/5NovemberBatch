package pracall;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		 Set<String> id = driver.getWindowHandles();
		 
	//	 System.out.println(id);
		 
		 ArrayList<String> al=new  ArrayList<String>(id);
		 
		 String cbadd = al.get(1);
		 
		 driver.switchTo().window(cbadd);
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		 
		 Thread.sleep(1000);
		 
	//	 driver.findElement(By.xpath("//a[@class='bmc-btn']")).click();
		 
	//	 driver.findElement(By.xpath("//span[text()='WebdriverIO'])[1]")).click();
	//	 
	//	 Thread.sleep(2000);
		 
	//	 driver.switchTo().window(al.get(0));
		 
		 
		 
		 
	}

}
