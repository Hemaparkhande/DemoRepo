package basic_program;
//"Assignment 173 Write a program about scroll bar(Up and Down), right to left "
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScrollUpdown_Assignment173 {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.linkText("Facebook"));
		Point p1=e1.getLocation();
		int x = p1.getX();
		int y = p1.getY();
		System.out.println(x);
		System.out.println(y);
//upcast driver to JavascriptExecutor interface
		JavascriptExecutor js=driver;
		
//		scroll up to down --> y axis
		js.executeScript("window.scrollBy(0,"+y+")");
	/*	js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");*/
//		scroll right to left --> x axis
		js.executeScript("window.scrollBy("+x+", 0)");
		
		e1.click();

	

		
	}

}
