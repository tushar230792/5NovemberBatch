package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //upcasting
		
		driver.get("https://www.google.co.in/");
		
		WebElement googlesearch = driver.findElement(By.xpath("(//input[@class='gNO89b']) [2]"));
		
	boolean result = googlesearch.isEnabled();    //googlesearch button enable or not
	
	System.out.println(result);
		

}
}
