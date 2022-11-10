package Amazon;

import java.io.File;
import java.io.IOException;
import java.util.List;

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

public class Story10 {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://amazon.com");
		/*Select list=new Select(driver.findElement(By.id("searchDropdownBox")));
        List<WebElement>catlist=list.getOptions();
        for(int i=0;i<catlist.size();i++)
        {
        	String keylist=catlist.get(i).getText();
        	System.out.println(keylist);
        }*/
       /* ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
        Actions ac=new Actions(driver);
       WebElement element= driver.findElement(By.linkText("Careers"));
        ac.moveToElement(element).build().perform();
        ac.doubleClick(element).build().perform();
      /*  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f, new File("C:\\Users\\dasbi\\amazonscreenshot.jpg"));*/
        driver.switchTo().frame(0);
        driver.quit();
	}
}
     
       
