package confilq.lime;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
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

public class Biswajit  {
	public static void main(String[] args) throws IOException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://amazon.com");
     WebElement element=driver.findElement(By.id("searchDropdownBox"));
    Select sc=new Select(element);
    List<WebElement>list=sc.getOptions();
    for(int i=0;i<list.size();i++)
    {
    	String catlist=list.get(i).getText();
    	System.out.println(catlist);
    }
    ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
    Actions ac=new Actions(driver);
   WebElement element1= driver.findElement(By.linkText("Careers"));
    ac.moveToElement(element1).build().perform();
	ac.doubleClick(element1).build().perform();
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f, new File("C:\\Users\\dasbi\\Downloads\\amazonscreenshot.jpg"));
	Set windows=driver.getWindowHandles();
	System.out.println(windows);
	driver.switchTo().frame(0);
	driver.switchTo().frame(1);
	
	
	}
/*@Override
public String toString()
{
	super.toString();
	return "Ravi";
}
public static void main(String[] args) {
	Object d=new Biswajit();
	System.out.println(d);
}*/
	
	
	
	
	
	
}
