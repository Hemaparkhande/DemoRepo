package TestNG_Assertions;

//"Assignment 183Logout from amazon assert and verify if test case is pass 
//Here we can check if the username text field is displaying if yes it is pass                "
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestNG_Package.Private_Credentials;

public class Asgn183_Amazon_logout extends Private_Credentials {
	@Test
	public void loginlogout() throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
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
		Thread.sleep(3000);

		WebElement accountandlist = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(accountandlist).perform();
		Thread.sleep(3000);

		WebElement signout = driver.findElement(By.xpath("//span[.='Sign Out']"));
		signout.click();

//		Assert.assertEquals(driver.getCurrentUrl(),
//				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		WebElement signinagain = driver.findElement(By.id("ap_email"));
		Assert.assertEquals(signinagain.isDisplayed(), true);
		driver.quit();
	}
}
