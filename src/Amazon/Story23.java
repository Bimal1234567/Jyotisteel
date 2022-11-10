package Amazon;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/*abstract class A
{
	A()
	{
		System.out.println("structure");
	}
	public void get()
	{
		System.out.println("it will");
	}
	abstract void run();
}
class Honda extends  A
{
	@Override
	void run()
	{
		System.out.println("Running");
	}
}*/
public class Story23 {
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("driver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://amazon.com");
		WebElement element=driver.findElement(By.id("searchDropdownBox"));
		Select sc=new Select(element);
		List<WebElement>list=sc.getOptions();
		sc.selectByValue("Books");
		for(int i=0;i<list.size();i++)
		{
			String catlist=list.get(i).getText();
			System.out.println(catlist);
		}
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		Actions ac=new Actions(driver);
		WebElement element1=driver.findElement(By.linkText("Careers"));
		ac.moveToElement(element1).build().perform();
		ac.doubleClick(element1).build().perform();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\dasbi\\Documents\\amazonscreenshot.jpg"));
		
	}
/*		Thread t1=new Thread()
	{
		public void run()qq
		{
			System.out.println("task one");
		}
	};
	Thread t2=new Thread()
	{
		public void run()
		{
	    System.out.println("task two");
		}
	};
   t1.start();
   t2.start();
}
}
		Runnable r1=new Runnable()
				{
			public void run()
			{
				System.out.println("task one");
			}
			};
		Runnable r2=new Runnable()
				{
			public void run()
			{
				System.out.println("task two");
			}
				};
				Thread t1=new Thread(r1);
				Thread t2=new Thread(r2);
				t1.start();
				t2.start();
	}*/
			
		}
