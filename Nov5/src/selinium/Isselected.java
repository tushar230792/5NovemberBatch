package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //upcasting
		
		driver.get("https://www.facebook.com/signup");
		
 WebElement female = driver.findElement(By.xpath("(//input[@type='radio']) [1]"));
	
 female.click();
 
 boolean result = female.isSelected();
 
 System.out.println(result);
 
// if(result==true)  {
	 
//	 System.out.println("Given element is selected");
	 
// }
 
// else {
	 
//	 System.out.println("elemen is not selected");
 
 WebElement male = driver.findElement(By.xpath("(//input[@name='sex']) [2]"));
	
	male.click();
	
	result=male.isSelected();
	
	System.out.println(result);
	
	Thread.sleep(3000);
	
	WebElement custom = driver.findElement(By.xpath("(//input[@name='sex']) [3]"));
	
	custom.click();
	
	result=custom.isSelected();
	
	System.out.println(result);
	 
 }
		
		

}

