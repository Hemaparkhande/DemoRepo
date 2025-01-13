package basic_program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//"Assignment 172
//Write a program to fetch the data (logindetails)from excel sheet using NumberToTextConveter"
public class Assignment_172 {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("/Users/hemag.gade/Documents/HemaSeleniumRepo/Selenium/DDT/logindetails.xlsx");
		Workbook w1 = WorkbookFactory.create(file);
		/*Sheet logindetails = w1.getSheet("logindetails");
		Row r1 = logindetails.getRow(1);
		Cell c1 = r1.getCell(0);
		System.out.println(c1.getStringCellValue());*/
//		String username = w1.getSheet("logindetails").getRow(1).getCell(0).getStringCellValue();
		String username = NumberToTextConverter.toText(w1.getSheet("logindetails").getRow(4).getCell(0).getNumericCellValue());

		String password = w1.getSheet("logindetails").getRow(4).getCell(1).getStringCellValue();

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.name("email"));
		 user.sendKeys(username);

		 WebElement continuetopage = driver.findElement(By.id("continue"));
		 continuetopage.click();

		 WebElement pswd = driver.findElement(By.id("ap_password"));
		 pswd.sendKeys(password);

		 WebElement signin = driver.findElement(By.xpath("span[@id='auth-signin-button']"));
		 signin.click();




	}

}
