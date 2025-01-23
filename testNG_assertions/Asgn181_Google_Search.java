package testNG_assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//"Assignment 181Launch Google->Search Something""Assert.assertnotequals(driver.cureentURL(),"https://www.google.com");
//Assert.assertnotequals(driver.gettitle(),"Google");"
public class Asgn181_Google_Search {
	@Test
	public void search() throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.id("APjFqb"));
		e1.sendKeys("India");
		e1.sendKeys(Keys.ENTER);
		
		Assert.assertNotEquals(driver.getCurrentUrl(), "https://www.google.com");
//		Assert.assertNotEquals(driver.getCurrentUrl(), driver.getTitle().contains("google"));
		
		
		driver.quit();
	}

}
