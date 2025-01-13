package TestNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//"Assignment 178 Create a class with 3 @test annotation which contains 3 method Set priory to individual methods
//1:Registration as priority 1, 2:login as priority 2, 3:logout as priority 3"
public class Annotation_Priority_Assignment178 
{
FirefoxDriver driver = new FirefoxDriver();

@Test(priority=2)
public void login()
{
	WebElement login = driver.findElement(By.linkText("Login"));
	login.click();;
}

@Test(priority=1)
public void registration()
{
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement e1 = driver.findElement(By.id("fname"));
	e1.sendKeys("Hema");
	WebElement e2 = driver.findElement(By.id("lname"));
	e2.sendKeys("P");
	WebElement e3 = driver.findElement(By.name("email"));
	e3.sendKeys("h1@gmail.com");
	WebElement e4 = driver.findElement(By.id("password"));
	e4.sendKeys("hema");
	WebElement e5 = driver.findElement(By.name("Present-Address"));
	e5.sendKeys("swiss");
	WebElement e6 = driver.findElement(By.id("Permanent-Address"));
	e6.sendKeys("swiss");
	WebElement e7 = driver.findElement(By.id("Pincode"));
	e7.sendKeys("1234");
}

@Test(priority=3)
public void logout()
{
// used another element instead of logout
	WebElement continuewithgoogle = driver.findElement(By.xpath("//div[@class='nsl-button nsl-button-default nsl-button-google']"));
	continuewithgoogle.click();
}

}

