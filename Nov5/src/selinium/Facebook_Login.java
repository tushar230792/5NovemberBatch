package selinium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook_Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //upcasting
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/login/");
		
		//Thread.sleep(2000);
		
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);   //deprecated method
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tusharmankar45@gmail.com");

//Thread.sleep(2000);

driver.findElement(By.xpath("//input[@type='text']")).clear();

//Thread.sleep(2000);

driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tusharmankar45@gmail.com");

//Thread.sleep(2000);

driver.findElement(By.xpath("//input[@type='password']")).sendKeys("tushar@45");

//Thread.sleep(2000);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@value='1']"))).click();

//driver.findElement(By.xpath("//button[@value='1']")).click();

		
		
		
	
	}
}
