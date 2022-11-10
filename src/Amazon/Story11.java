package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Story11 {

	public static void main(String[] args) {
		 WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		if(driver.findElement(By.linkText("Sign Up")).isDisplayed())
		{
			System.out.println("Test is pass");
		}else
		{
			System.out.println("Ttest is fail");
		}
		driver.findElement(By.name("firstname")).sendKeys("Biswaranjan");
		driver.findElement(By.name("lastname")).sendKeys("Das");
		driver.findElement(By.name("reg_email__")).sendKeys("das.biswaranjan500@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("das.biswaranjan500@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Das@123%");
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByValue("1");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("11");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1995");
		driver.findElement(By.xpath("//input[@name='sex'and @value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		/*int n=10;
		for(int i=0;i<=n;i++)
		{
	      if(i%2==0)
	      {
	    	  System.out.println("The even no."+i);
	      }else
	      {
	    	  System.out.println("The odd no."+i);
	      }
		}*/
}

}
