package confilq.lime;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Program4 {
	@Test(dataProvider = "logindata")
	public void login(String uname,String pwd)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http:\\facebook.com");
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}
	@DataProvider(name="logindata")
    public Object[][] getdata()
    {
    	Object[][]data= {{"bascja@gmail.com","457861"},{"hzxhau@gmail.com","84156645"}};
    	return data;
  
    }

	
	
	}	
	
/*@BeforeSuite
public void setup()
{
	System.out.println("enter the url");
}
@BeforeClass
public void initialize()
{
	System.out.println("enter the link");
}
@BeforeMethod
public void run()
{
	System.out.println(" site is running");
}
@BeforeTest
public void startup()
{
	System.out.println("symbolized");
}
@Test
public void login()
{
	System.out.println("Spiderman");
}
@Test
public void homepage()
{
	System.out.println("Black Adam");
}
@Test
public void contact()
{
	System.out.println("MoonKnight");
}
@AfterTest
public void ends()
{
	System.out.println("end its");
}
@AfterMethod
public void stop()
{
	System.out.println("**");
}
@AfterClass
public void iqulity()
{
	System.out.println("******");
}
@AfterSuite
public void shutdown()
{
	System.out.println("close it");
}
}*/
