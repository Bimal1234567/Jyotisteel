package Amazon;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Story19 {
	public static void main(String[] args) {
	 WebDriver driver;
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("https://amazon.com");
	 driver.findElement(By.name("field-keywords")).sendKeys("samsung mobiles");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 Map element=new HashMap();
	 element.put("SAMSUNG Galaxy S22+ Cell Phone,"
	 		+ " Factory Unlocked Android Smartphone, 256GB,"
	 		+ " 8K Camera & Video, Brightest Display Screen,"
	 		+ " Long Battery Life, Fast 4nm Processor,"
	 		+ " US Version, Phantom Black",
			       "960");
	 element.put("SAMSUNG Galaxy S21 FE 5G Cell Phone, "
	 		+ "Factory Unlocked Android Smartphone, 128GB, "
	 		+ "120Hz Display Screen, Pro Grade Camera,"
	 		+ " All Day Intelligent Battery, US Version, Graphite", 
			     "599");
	 element.put("SAMSUNG Galaxy Z Fold 4 Cell Phone, "
	 		+ "Factory Unlocked Android Smartphone, 256GB,"
	 		+ " Flex Mode, Hands Free Video, Multi Window View,"
	 		+ " Foldable Display, S Pen Compatible, US Version, Phantom Black", 
			    "1,499");
	 System.out.println(element);
		
		  
	  }
		
		
		
		
		/* int n=10;
	    for(int i=0;i<=n;i++)
	    {
	    	if((i%2)!=0)
	    	{
	    		System.out.println("odd no:"+i);
	    	}
	    }
	}*/

}
