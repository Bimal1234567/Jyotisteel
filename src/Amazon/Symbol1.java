package Amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Symbol1 {

	public static void main(String[] args)  {
		
		WebDriver driver;
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		WebElement element=driver.findElement(By.id("searchDropdownBox"));
		Select sc=new Select(element);
		List<WebElement>list=sc.getOptions();
		sc.selectByIndex(0);
		for(int i=0;i<list.size();i++)
		{
			String catlist=list.get(i).getText();
			System.out.println(catlist);
		}
		((JavascriptExecutor)driver).executeScript("scroll(0,300)");
		Actions ac=new Actions(driver);
		WebElement element1=driver.findElement(By.linkText("Careers"));
		ac.moveToElement(element1).build().perform();
		ac.doubleClick(element1).build().perform();
		
		
		
		
		
		
		
		
	}

	/*	driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement>list=driver.findElement(By.xpath("\\*[@role='listbox']")).findElements(By.tagName("li"));
		for(int i=0;i<list.size();i++)
		{
			String s1=list.get(i).getText();
			if(s1.toLowerCase().contains("download"))
			{
				list.get(i).getText();
				break;
			}
		}*/
	
		
		

	}


