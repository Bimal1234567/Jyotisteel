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

public class Story17 {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://amazon.com");
	/*	WebElement element=driver.findElement(By.id("searchDropdownBox"));
		Select sc=new Select(element);
		List<WebElement>list=sc.getOptions();
		sc.selectByIndex(2);
		for(int i=0;i<list.size();i++)
		{
			String keylist=list.get(i).getText();
			System.out.println(keylist);
		}*/
	    ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	    Actions ac=new Actions(driver);
	    WebElement element1= driver.findElement(By.xpath("\\*[@class='nav_first'])"));
	    ac.moveToElement(element1).build().perform();
	    ac.doubleClick(element1).build().perform();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\dasbi\\Downloads\\amazonscreenshot.jpg"));
		

	}

}
