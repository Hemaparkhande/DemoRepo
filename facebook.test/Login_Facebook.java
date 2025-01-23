package facebook.test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import facebook.source.facebook_loginpage;

public class Login_Facebook 
{
@Test
public void loginwithrightcredentials() throws InterruptedException
{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	facebook_loginpage f1 = new facebook_loginpage(driver);
	f1.username();
	f1.password();
	Thread.sleep(3000);
	f1.login();
}
}
