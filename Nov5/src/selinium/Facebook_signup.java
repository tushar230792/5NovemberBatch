package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_signup {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //upcasting
		
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("tushar");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("mankar");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("tusharmankar45@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("tusharmankar45@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("tushar@45");
		
}

}
