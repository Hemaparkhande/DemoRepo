package TestNG_Package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment179_5Users {
	@DataProvider(name="logindata")
public Object[][] logins() throws EncryptedDocumentException, IOException
{
FileInputStream f1 = new FileInputStream("/Users/hemag.gade/Documents/HemaSeleniumRepo/Selenium/DDT/logindetails.xlsx");
Workbook w1 = WorkbookFactory.create(f1);
	
	String user1= w1.getSheet("logindetails").getRow(0).getCell(0).getStringCellValue();
	String pwd1 = w1.getSheet("logindetails").getRow(0).getCell(1).getStringCellValue();
	
	String user2= w1.getSheet("logindetails").getRow(1).getCell(0).getStringCellValue();
	String pwd2 = w1.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();
	
	String user3= NumberToTextConverter.toText(w1.getSheet("logindetails").getRow(2).getCell(0).getNumericCellValue());
	String pwd3 = w1.getSheet("logindetails").getRow(2).getCell(1).getStringCellValue();
	
	String user4= NumberToTextConverter.toText(w1.getSheet("logindetails").getRow(3).getCell(0).getNumericCellValue());
	String pwd4 = w1.getSheet("logindetails").getRow(3).getCell(1).getStringCellValue();
	
	String user5= w1.getSheet("logindetails").getRow(4).getCell(0).getStringCellValue();
	String pwd5 = w1.getSheet("logindetails").getRow(4).getCell(1).getStringCellValue();
	
	Object [][]data1 = new Object[5][2];
	data1 [0][0]= user1;//	1 Valid UN and Valid password
	data1 [0][1]= pwd1;
	data1 [1][0]= user2;//	2 Valid UN and Invalid Password
	data1 [1][1]= pwd2;
	data1 [2][0]= user3;//	3 Valid mobile number and password
	data1 [2][1]= pwd3;
	data1 [3][0]= user4;//	4 Invalid mobile number and password
	data1 [3][1]= pwd4;
	data1 [4][0]= user5;//	5 invalid UN and valid password
	data1 [4][1]= pwd5;
	return data1;
}
	@Test(dataProvider="logindata")
	public void searchonamazon(String username, String password) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement e2 = driver.findElement(By.id("ap_email"));
		e2.sendKeys(username);
		WebElement e3 = driver.findElement(By.id("continue"));
		e3.click();
		WebElement e4 = driver.findElement(By.id("ap_password"));
		e4.sendKeys(password);
		Thread.sleep(3000);
		driver.quit();
	}

}
