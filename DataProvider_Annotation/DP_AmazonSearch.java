package TestNG_Package.DataProvider_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DP_AmazonSearch extends DP_launchquit_AmazonSearch
{
	@Test
	
	public void search() throws InterruptedException
	{
		
	Thread.sleep(4000);
	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("mobiles");
	search.sendKeys(Keys.ENTER);
	
	}
}
