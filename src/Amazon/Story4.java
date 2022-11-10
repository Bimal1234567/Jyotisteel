package Amazon;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Story4 {

	
	public static void main(String[] args) throws IOException {
	    WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://redbus.in");
		driver.findElement(By.id("src")).sendKeys("Bangalo");
		List<WebElement>list=driver.findElement(By.className("autoFill homeSearch")).findElements(By.tagName("li"));
		for(int i=0;i<list.size();i++)
		{
			String keylist=list.get(i).getText();
			if(keylist.toLowerCase().contains("Majestic Bangalore"))
			{
				list.get(i).getText();
				break;
			}
		}
		/*Select sc=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>catlist=sc.getOptions();
		for(int i=0;i<catlist.size();i++)
		{
			String keylist=catlist.get(i).getText();
			System.out.println(keylist);
		}
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\dasbi\\amazonscreenshot.jpg"));
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		Actions ac=new Actions(driver);
		WebElement element=driver.findElement(By.linkText("Careers"));
		ac.moveToElement(element).build().perform();
		ac.doubleClick(element).build().perform();
		String currentwindow=driver.getWindowHandle();
		System.out.println(currentwindow.toString());
		Set windows=driver.getWindowHandles();
		System.out.println(windows.toString());
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();*/
		
		
	}
 
	
	
	
	
	
}
