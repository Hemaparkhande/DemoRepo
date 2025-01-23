package TestNG_Package.DataProvider_Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class DP_launchquit_AmazonSearch 
{	
	WebDriver driver;
	@Parameters("browser")
	
	@BeforeMethod
	public void launch(String browsername) 
	{
		
		if (browsername.equals("chrome"))
		{
			driver= new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
		}
		
		if (browsername.equals("edge"))
		{
			driver= new EdgeDriver();
			driver.get("https://www.amazon.in/");
		}
		
		if (browsername.equals("firefox"))
		{
			driver= new FirefoxDriver();
			driver.get("https://www.amazon.in/");
		}

	}

	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();

	}
}