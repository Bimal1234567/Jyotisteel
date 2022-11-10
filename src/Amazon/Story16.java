package Amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Story16 {

	public static void main(String[] args) {
	 
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://redbus.in");
		driver.findElement(By.id("src")).sendKeys("mara");
		List<WebElement>list=driver.findElement(By.className("autoFill homeSearch")).findElements(By.tagName("li"));
		for(int i=0;i<list.size();i++)
		{
			String x=list.get(i).getText();
		    if(x.toLowerCase().contains("marathalli, Bangalore"))
		    {
		      list.get(i).getText();
		      break;
		    }
		}
		driver.findElement(By.id("dest")).sendKeys("murges");
		List<WebElement>catlist=driver.findElement(By.className("autoFill homeSearch")).findElements(By.tagName("li"));
		for(int i=0;i<catlist.size();i++)
		{
			String y=catlist.get(i).getText();
			if(y.toLowerCase().contains("murgeshpalya Bangalore"))
			{
				catlist.get(i).getText();
				break;
			}
		}
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.id("rb-calendar_onward_cal")).sendKeys("15/Oct/2022");
		driver.findElement(By.id("search_btn")).click();
		
		
		
		
		
		

	}

}
