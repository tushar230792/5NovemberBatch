package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Liatbox2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tushar\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //upcasting
		driver.get("https://www.facebook.com/signup");
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s=new Select (Month);
		
//		s.selectByIndex(5);
//		
//		System.out.println(s.getFirstSelectedOption().getText());
//
		
		List<WebElement> alloptions = s.getAllSelectedOptions();
		
		for(int i=0; i<=alloptions.size()-1; i++) {
			
			System.out.println(alloptions.get(i).getText());
		}
			
			
		}



}
