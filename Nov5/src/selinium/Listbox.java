package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	
private static final WebElement Month = null;

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //upcasting
		
		driver.get("https://www.facebook.com/signup");
		
//		WebElement date = driver.findElement(By.xpath("//select[@title='Day']"));
//		
//		Select s=new Select (date);
//		
//		s.selectByIndex(12);
//		
//		Thread.sleep(2000);
//		
//		s.selectByValue("15");
//		
//		Thread.sleep(2000);
//		
//		s.selectByVisibleText("10");
	
//		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
//		
//		Select t=new Select(Month);
//		
//		t.selectByIndex(5);
//		
//		Thread.sleep(2000);
//		
//		t.selectByValue("8");
//		
//		Thread.sleep(2000);
//		
//		t.selectByVisibleText("Nov");
//		

		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select y=new Select(Year);
		
		y.selectByIndex(7);
		
		Thread.sleep(2000);
		
		y.selectByValue("2010");
		
		Thread.sleep(2000);
		
		y.selectByVisibleText("2020");	
}
}
