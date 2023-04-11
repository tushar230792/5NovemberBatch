package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\tushar\\Downloads\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();   //upcasting
			
			driver.get("https://nxtgenaiacademy.com/alertandpopup/");
			
//		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
//		
//		Thread.sleep(2000);
//			
//			driver.switchTo().alert().accept();
//			
//			Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
//			
//			Thread.sleep(2000);
//			
//		     driver.switchTo().alert().dismiss();
//			
			driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
			
			
			
			org.openqa.selenium.Alert Alt = driver.switchTo().alert();
			
			Alt.sendKeys("no");
			
			Thread.sleep(3000);
			
			Alt.accept();
	}

}

