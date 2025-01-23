package listenersTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners_logic.class)
public class Mainclass_Listeners extends listeners_logic
{
@Test
public void loginamazon() throws InterruptedException
{
	driver = new FirefoxDriver();
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
	
	Thread.sleep(5000);
	driver.quit();
}
	
	
}
