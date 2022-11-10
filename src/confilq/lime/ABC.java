package confilq.lime;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ABC {

	public static void main(String[] args) {
		
		
String x="Papu";
String y="Pencil";
int z=x.compareTo(y);
System.out.println(z);

		
		
	

     /*
		 WebDriver driver;
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://amazon.com");
		/*Select sc=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>catlist=sc.getOptions();
		for(int i=0;i<catlist.size();i++)
		{
			String s1=catlist.get(i).getText();
			System.out.println(s1);
			
		}*/
	/*	((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		Actions ac=new Actions(driver);
		WebElement element=driver.findElement(By.className("nav_a"));
		ac.moveToElement(element).build().perform();
		ac.doubleClick(element).build().perform();*/
		
		
		
		
		
		
		
     /* WebDriver driver;
      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.get("http://redbus.in");
      driver.findElement(By.id("src")).sendKeys("Bhuba");
      List<WebElement>list=driver.findElement(By.xpath("//*[@class='autoFill homeSearch']")).findElements(By.tagName("li"));
      for(int i=0;i<list.size();i++)
      {
    	  String x=list.get(i).getText();
    	  System.out.println(x);
    	  if(x.toLowerCase().contains("Bhubaneswar"))
    	  {
    		list.get(i).getText();
    		break;
    	  }
      }
      String currentwindow=driver.getWindowHandle();
      System.out.println(currentwindow);
      String y=currentwindow.toString();
      System.out.println(y);
      driver.switchTo().frame(0);
      driver.switchTo().frame(1);*/
      
	}

}
