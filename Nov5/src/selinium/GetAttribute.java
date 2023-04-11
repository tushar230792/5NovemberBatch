package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //upcasting
		
		driver.get("https://www.facebook.com/signup");
		
	//	WebElement ele = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-']) [5]"));
		
	//	String attribute = ele.getAttribute("autocomplete");
		
	//	System.out.println(attribute);
		
		WebElement ele = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-']) [3]"));

		String attribute = ele.getAttribute("name");
		
		System.out.println(attribute);

}
}
