package Screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Datetimescrn {

public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tushar\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();   //upcasting
		
		driver.get("https://www.facebook.com/signup");
		
		for(int i=1; i<=10; i++) {
			
		//screenshot create
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(2);
		
		 String time = new  SimpleDateFormat("MM_dd_yyyy_hh_mm_ss").format(new Date());
		 
		System.out.println(time);
		
		//screenshot save here
		File destination = new File("C:\\Users\\tushar\\Desktop\\screenshot\\facebook@signup1234"+random+time+".jpg");
		
		FileHandler.copy(source, destination);
		
		}
}
}
