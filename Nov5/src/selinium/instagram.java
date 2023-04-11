package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //upcasting
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tusharmankar45@gamil.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tushar@45");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='_ab37']")).click();
		
}

}
