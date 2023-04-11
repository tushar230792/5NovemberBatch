package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver ();
		
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
//		
//		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
//		
//		driver.switchTo().alert().accept();
//		
		
//		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.switchTo().alert().accept();
//		
//		driver.switchTo().alert().dismiss();
//		
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("no");
		
		alt.accept();
		
		
		
		
			
		
	}
}


