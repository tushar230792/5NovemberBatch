package selinium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tushar\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //upcasting
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		
	//	driver.close();    //current tab closed
		
	//	driver.quit();     //current browser closed
		
	//	String title = driver.getTitle();
		
	//	System.out.println(title);
		
	//	String exptitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
    //    if(title.equalsIgnoreCase(exptitle))   {
    //    	System.out.println("Navigate to correct page");
  //      }
        	
       // 	else  {
    //    		System.out.println("Navigate to invalid page");
		
	//	driver.switchTo().newWindow(WindowType.TAB);
	//	driver.get("https://www.youtube.com/");
	//	driver.close();
		
	//	driver.switchTo().newWindow(WindowType.WINDOW);
	//	driver.get("https://www.youtube.com/");
     
     
  //   driver.manage().window().maximize();
		
//	}
	//	String url = driver.getCurrentUrl();
		
		//	System.out.println(url);
			
		//	String expurl="https://www.flipkart.com/";
			
	//      if(url.equalsIgnoreCase(expurl))   {
	   //     	System.out.println("Navigate to correct page");
	  //      }
	        	
	//        	else  {
	  //     		System.out.println("Navigate to invalid page");
		
//		driver.navigate().to("https://www.youtube.com/");
//		driver.navigate().back();
//		Thread.sleep(5000);
//	    driver.navigate().refresh();
//	    Thread.sleep(5000);
	    
//	    driver.manage().window().maximize();
//	    Thread.sleep(5000);
//	    driver.close();
		
//	Dimension d=new Dimension(200,300);
//	driver.manage().window().setSize(d);
//		Thread.sleep(3000);
//	Point P=new Point (100,400);
//	driver.manage().window().setPosition(P);
		
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.manage().window().getSize());
		driver.quit();
	
	}
	}

        		
        
	


