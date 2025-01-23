package listenersTestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Mainclass_Amazon.class)
public class Mainclass_Amazon extends Listeners_Logic2
{
	@Test
	public void launchamazon() throws InterruptedException
	{
	driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("//input[@id='searchtextbox']"));//twotab removed from searchtextbox
	search.sendKeys("shoes");
	search.sendKeys(Keys.ENTER);

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	WebElement shoe = driver.findElement(By.xpath("//div[@class='s-image-padding'][1]"));
	shoe.click();

	Set<String> allbrowsersid = driver.getWindowHandles();
	System.out.println(allbrowsersid);

	Iterator<String> pc = allbrowsersid.iterator();

	String parentbrowserid = pc.next();
//	System.out.println(parentbrowserid);
	String childbrowserid = pc.next();
//	System.out.println(childbrowserid);

	driver.switchTo().window(childbrowserid);
	Thread.sleep(3000);

	WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
	addtocart.click();

	WebElement proceedtobuy = driver.findElement(By.name("proceedToRetailCheckout"));
	proceedtobuy.click();
Thread.sleep(5000);
	WebElement signin = driver.findElement(By.id("ap_email"));
	signin.sendKeys("+41765220387");
	signin.sendKeys(Keys.ENTER);

	WebElement password = driver.findElement(By.id("ap_password"));
	password.sendKeys("Hema@123");
	password.sendKeys(Keys.ENTER);

	WebElement address = driver.findElement(By.xpath("//span[@class='a-label a-radio-label']"));
	address.click();
	Thread.sleep(8000);

	WebElement usethisaddress = driver.findElement(By.xpath("(//input[@class='a-button-input'])[6]"));
	usethisaddress.click();
			Thread.sleep(8000);

	WebElement paymentmethod = driver.findElement(By.name("ppw-instrumentRowSelection"));
	paymentmethod.click();

}
}