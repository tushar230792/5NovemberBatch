package Actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autio {
	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\tushar\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("oneplus");
		
		Thread.sleep(3000);
		
		
		 List<WebElement> option = driver.findElements(By.xpath("//div[@class='aajZCb']"));
		 
		 
		 
		 for(int i=0; i<option.size(); i++)  {
			 
			 System.out.println(option.get(i).getText());
		
		
		
	}

}
}
