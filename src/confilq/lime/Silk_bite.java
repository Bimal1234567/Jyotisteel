package confilq.lime;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.google.common.io.Files;

public class Silk_bite {
	
    public static void main(String[] args) throws IOException {
    	WebDriver driver;
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		WebElement element=driver.findElement(By.id("searchDropdownBox"));
		Select sc=new Select(element);
		List<WebElement>catlist=sc.getOptions();
		for(int i=0;i<catlist.size();i++)
		{
			String list=catlist.get(i).getText();
			System.out.println(list);
		}
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		Actions ac=new Actions(driver);
		WebElement element1=driver.findElement(By.linkText("Careers"));
		ac.moveToElement(element1).build().perform();
		ac.doubleClick(element1).build().perform();
		WebDriver iframe=driver.switchTo().frame(0);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\dasbi\\Downloads\\amazonscreenshot.jpg"));
		
		
		
	}
	
	
	
	
	
	
	
	/*WebDriver driver=null;
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser)
	{
		System.out.println("Browser name is:"+browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.driver.gecko", "geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		System.out.println("Test complete successfully");
	}
	
	
	
	
	
	
	
/*	@Test(dataProvider ="loginfunction")
	public void login(String uname,String pwd)
	{
        WebDriver driver;
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		
	}
	
     @DataProvider(name="loginfunction")
	public Object[][] getdata()
	{
		Object[][] data= {{"solid@gmail.com","123456"},{"xjfidjq@gmail.com","789456"}};
		return data;
	}*/
	
	
	

}
