package pracall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(iframe);     //selinium focus main page to iframe
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();     //selinium focus iframe to main page
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		
	}

}
