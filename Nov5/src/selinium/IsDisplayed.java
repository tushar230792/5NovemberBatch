package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //upcasting
		
		driver.get("https://www.facebook.com/signup");
		
		 WebElement female = driver.findElement(By.xpath("(//input[@type='radio']) [1]"));
			
		 female.click();
		 
		 WebElement male = driver.findElement(By.xpath("(//input[@type='radio']) [2]"));
		 
		 male.click();
		
		WebElement customgen = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		
		customgen.click();
		
		boolean result = customgen.isDisplayed();
		
		System.out.println(result);
		
		
		
		

}
}
