package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox3 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tushar\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //upcasting
		driver.get("https://www.facebook.com/signup");
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s= new Select (Month);
		
		boolean result = s.isMultiple();
		
		System.out.println(result);
		
		if (result==true)  {
			
			System.out.println("The given listbox is multiselected");
		}
			
			else
				System.out.println("List box is single selected");
				
		}

}
