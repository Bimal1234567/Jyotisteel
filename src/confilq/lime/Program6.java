package confilq.lime;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import graphql.Assert;
import confilq.lime.Program4;

public class Program6  {
    WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	public void setup(String browser,String app)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.driver.firefox", "geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(app);
		
	}
	
	@Test
	public void logo()
	{
		WebElement element=driver.findElement(By.xpath("\\img[@alt='Facebook']"));
		Assert.assertTrue(element.isDisplayed());
	}
	
}
