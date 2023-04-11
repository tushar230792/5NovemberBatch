package pracall;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class scrollupdown {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.album.alexflueras.ro/index.php");
		
		Thread.sleep(1000);
		
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		
		scroll.executeScript("window.scrollBy(0,300)");   //scroll down
		
		Thread.sleep(2000);
		
        scroll.executeScript("window.scrollBy(0,-300)");   //scroll down
		
		Thread.sleep(2000);
		
        scroll.executeScript("window.scrollBy(3000,0)");   //scroll down
		
		Thread.sleep(2000);
		
         scroll.executeScript("window.scrollBy(-3000,0)");   //scroll down
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
	

}
}
