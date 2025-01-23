package TestNG_Package.DataProvider_Annotation;
//"Assignment 174 Create multiple test cases in TestNG and run as TestNG suite"
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//DataProvider annotation is used when u want to test with multiple inputs but not combination
public class Asgn174_DP_multipleinputs 
{
	@DataProvider(name = "data1")
	public Object method1() 
	{
		return new Object[][] { { "Black shoes" }, { "pants" } };
	}// when u use object take return type
	
	@DataProvider(name="data2")
	public Object[][]method2()
	{
		return new Object[][] {{"Clothes"},{"mobiles"},{"shoes"},{"shirts"}};	
	}
	@DataProvider(name="data3")
	public Object[][]method3()
	{
	Object data3[][]= new Object[5][1];
	data3[0][0]="clothes";
	data3[1][0]="mobiles";
	data3[2][0]="pants";
	data3[3][0]="shoes";
	data3[4][0]="toys";
	return data3;
	}
	@Test(dataProvider = "data3") // dataProvider in camel case
	public void searchonamazon(String input) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(input.concat((" size 38") + Keys.ENTER));

		Thread.sleep(3000);
		driver.quit();
	}
}
/*@DataProvider(name="data2")
	public  Object method2() 
	{
		return new Object[][] {{20},{30},{50}};
	}
	@Test(dataProvider="data2")
public void addition(int a)
{
	int sum = a +100;
	Reporter.log("Answer is :" + sum);
}*/

