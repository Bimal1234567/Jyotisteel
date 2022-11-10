package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Story20 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://facebook.com");
	    boolean x=driver.findElement(By.name("login")).isDisplayed();
	    System.out.println(x);
	    driver.findElement(By.id("email")).sendKeys("8093659130");
	    driver.findElement(By.id("pass")).sendKeys("Das@123%");
	    driver.findElement(By.name("login")).click();
	    boolean title=driver.findElement(By.id("facebook")).isDisplayed();
	    System.out.println(title);
	    driver.findElement(By.className("xbh8q5q x1pwv2dq xvlca1e")).click();
	    driver.findElement(By.linkText("Log Out")).click();
	}

}
