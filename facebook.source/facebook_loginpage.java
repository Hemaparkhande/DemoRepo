package facebook.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook_loginpage 
{
	WebDriver driver;
@FindBy(id="email")
WebElement un;

@FindBy(name="pass")
WebElement pwd;

@FindBy(name="login")
WebElement login_button;


public void username() 
{
	un.sendKeys("hemag.gade@gmail.com");
}
public void password() 
{
	pwd.sendKeys("Hema@123");
}
public void login() 
{
	login_button.click();
}

public facebook_loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
