package p1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
 
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://redbus.in");
		driver.findElement(By.id("src")).sendKeys("Murgesh");
		List<WebElement>catlist=driver.findElement(By.xpath("//*[@class='autoFill homeSearch']")).findElements(By.tagName("li"));
		for(int i=0;i<catlist.size();i++)
		{
			String s1=catlist.get(i).getText();
			if(s1.toLowerCase().contains("Murgeshpalya,Bangalore"))
			{
				catlist.get(i).getText();
				break;
			}
		}
	}	
	
	
	
	
	
	
	
	
	
}
