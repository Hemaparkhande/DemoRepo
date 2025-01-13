package basic_program;
//"Assignment 170Write a program to automate the website where right click does not work.
//https://retail.onlinesbi.sbi/retail/login.htm Go to the site and provide user name and pwd using F12: "
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Asgn170_Method_isEnabled2_sbi {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();

		WebElement login = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		login.click();

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Hema");

		WebElement password = driver.findElement(By.id("label2"));
		password.sendKeys("123");

		WebElement captcha1 =driver.findElement(By.id("capOption"));
		captcha1.click();

		Thread.sleep(3000);
		WebElement captcha2 =driver.findElement(By.xpath("(//label[@class='col-md-6 col-sm-12 col-xs-6'])[2]"));
		captcha2.click();

		WebElement virtualkeyboard =driver.findElement(By.xpath("//input[@type='checkbox']"));
		virtualkeyboard.click();

		WebElement complaints = driver.findElement(By.linkText("Complaints"));
		complaints.click();

		WebElement complainttype = driver.findElement(By.id("RaiseCRCRTypes"));
		complainttype.click();
		Select s1 = new Select(complainttype);
		s1.selectByValue("1");

		Thread.sleep(2000);
		driver.quit();
	}

}
