package testNG_assertions;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import basic_program.Private_Credentials;
//"Assignment 180 Login to amazon with right credentials by using the presence of the component 
//1.isdisplayed Assert.assertEquals(e1.isdisplayed , true);"
//Assert class should be used inside the annotation not in main method
public class Asgn180_Amazon_loginAndSearch
{
	@Test
	public void testcase1() throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement signin = driver.findElement(By.id("ap_email"));
		signin.sendKeys("+41765220387");
		signin.sendKeys(Keys.ENTER);
		 WebElement continuetopage = driver.findElement(By.id("continue"));
		 continuetopage.click();
		 Thread.sleep(2000);
		 WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Hema@123");
		password.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		List<WebElement> shoes = driver.findElements(By.xpath("//div[@class='s-image-padding']"));
		System.out.println(shoes.size());
//		Assert.assertEquals(search.isDisplayed(), true);
		Assert.assertEquals(shoes.size()>20, true);
	
		
	}

	
	

}
