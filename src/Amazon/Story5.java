package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Story5 {
	WebDriver driver=null;

	@Parameters("browser")
	@BeforeTest
	public void setup(String browser)
	{
		System.out.println("Browser name is:"+browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.driver.chrome","chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.driver.gecko","geckodriver.exe");
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
    /*   Story5()
       {
    	   this(2);
    	   System.out.println();
       }
       Story5(int x)
       {
    	   
    	   System.out.println(x);
       }
       Story5(int x,int z)
       {
    	   
    	   System.out.println(x);
    	 System.out.println(z);  
       }
      
	public static void main(String[] args) {
		
		test();
	}
	public static void test()
	{	
		
		Story5 s1=new Story5();
		Story5 s2=new Story5(2);
		Story5 s3=new Story5(3,5);
		
	}
		/*Story5 s2=new Story5();
		System.out.println(s1);
		System.out.println(s2);*/
	/* int x=15;
	 ++x;
	 System.out.println("the value of x is:"+ x++);*/
		
		
		
		
		
	/*	Story5 s=new Story5();
		System.out.println(s.x);
		s.test();
		s.test1();
	}
	int y=30;
	public void test()
	{
		System.out.println(y);
	}
	int z=20;
   public void test1()
   {
	   System.out.println(z);
   }*/
}

