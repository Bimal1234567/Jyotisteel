package Amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Story2 {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://redbus.in");
		driver.findElement(By.id("src")).sendKeys("Bhub");
		List<WebElement>list=driver.findElement(By.xpath("//*[@class='autoFill homeSearch']")).findElements(By.tagName("li"));
		for(int i=1;i<list.size();i++)
		{
			String x=list.get(i).getText();
			if(x.toLowerCase().contains("Bhubaneswar"))
			{
				list.get(i).click();
				break;
			}
			
			
		}
		driver.findElement(By.id("dest")).sendKeys("Talc");
		List<WebElement>list1=driver.findElement(By.xpath("//*[@class='autoFill homeSearch']")).findElements(By.tagName("li"));
        for(int i=1;i<list1.size();i++)
        {
        	String y=list1.get(i).getText();
        	if(y.toLowerCase().contains("Talcher"))
        	{
        		list1.get(i).click();
        		break;
        	}
        }
	}

}
