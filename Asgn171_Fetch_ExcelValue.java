package basic_program;
//"Assignment 172 Write a program to fetch the data (logindetails)from excel sheet using NumberToTextConveter"
import java.io.FileInputStream;
import java.io.IOException;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Asgn171_Fetch_ExcelValue {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileInputStream f1 = new FileInputStream("/Users/hemag.gade/Documents/HemaSeleniumRepo/Selenium/DDT/logindetails.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);

		Sheet s1 = w1.getSheet("logindetails");
/*	    Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);

		String s2 = c1.getStringCellValue();
		System.out.println(s2);*/
//		easy way--->
//		String username = w1.getSheet("logindetails").getRow(2).getCell(0).getStringCellValue();
		String username = NumberToTextConverter.toText(w1.getSheet("logindetails").getRow(2).getCell(0).getNumericCellValue());
		System.out.println(username);

		String password = s1.getRow(1).getCell(1).getStringCellValue();
		System.out.println(password);

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		WebElement e1 = driver.findElement(By.name("customerName"));
//		e1.sendKeys("Hema P");
		Thread.sleep(1000);
		WebElement e2 = driver.findElement(By.id("ap_phone_number"));
		e2.sendKeys(username);
		WebElement e3 = driver.findElement(By.name("password"));
		e3.sendKeys(password);

		Thread.sleep(2000);
		driver.quit();

	}

}
