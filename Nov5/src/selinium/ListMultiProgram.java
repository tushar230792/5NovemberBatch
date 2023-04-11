package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListMultiProgram {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //upcasting
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		
	Select s=new Select (year);
	
	List<WebElement> option = s.getOptions();
	
	int size = option.size();   //to get size of listbox
	
	System.out.println(size);
	
	for(int i=0; i<=option.size()-1; i++) {
	
	System.out.println(option.get(i).getText());
	
	}
		
	
		
		
		
	
	
		

}
}
