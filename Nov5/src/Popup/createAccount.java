package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createAccount {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("a@bb.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("dhih1e12nsa");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("(//button[@type='submit']) [2]")).click();
		
	}

}
