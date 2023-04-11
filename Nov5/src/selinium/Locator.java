package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //upcasting
		
		driver.get("https://www.facebook.com/login/");
		
		
//		driver.findElement(By.id("email")).sendKeys("tushar");
//		
//		driver.findElement(By.id("pass")).sendKeys("mankar");

		driver.findElement(By.name("email")).sendKeys("tushar"); //name=unique locator
//		
//		driver.findElement(By.name("pass")).sendKeys("mankar");
		
	//	driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("tushar");
		
	//	driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("mankar");
		
		
	//	driver.findElement(By.linkText("Games")).click();
		
	//	driver.findElement(By.partialLinkText("Information")).click();
		
}
}
