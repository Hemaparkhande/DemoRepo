package testNG_assertions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//"Assignment 182launch amazon->search a product->assert and verify if test case is pass
//"List<Webelement> l=driver.fes(by.xpath(""));Assert.assertequals(l.size()>20,true);
public class Asgn182_Amazon_isDisplayed {
	@Test()
	public void launch() throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		List<WebElement> shoes = driver.findElements(By.xpath("//div[@class='s-image-padding']"));
		System.out.println(shoes.size());
		Assert.assertEquals(shoes.size() > 20, true);

	}
}