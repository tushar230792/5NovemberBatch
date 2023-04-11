package Iframe;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframebasic {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\tushar\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();   //upcasting
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		 WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(iframe);    //changed selinium focus from main page to iframe
	
	driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.switchTo().defaultContent();    //selinium focused changed to main page
		
	//driver.switchTo().parentFrame();
	
	
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();

}
}
