package confilq.lime;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Programe7 {
	
	/*@Test(dataProvider = "loginfunction")
	public void login(String uname,String pwd)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		
	}
    @DataProvider(name="loginfunction")
	public Object[][] getdata()
	{
		Object[][] data= {{"biswaranjan65@gmail.com","123456"},{"story123@gmail.com","7892456"}};
		return data;
		}
	

	*/
}
