package basic_program;
//"Assignment 168 Find out all the links of amazon.in Find out the broken link and status code with response.
//Handle the exception with try catch"
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Asgn168_GetLinks {

	public static void main(String[] args) throws IOException
	{
		FirefoxOptions options =new FirefoxOptions();
		options.addArguments("--headless=new");

		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		List<WebElement> alllinks= driver.findElements(By.tagName("a"));
		int count = alllinks.size();
		System.out.println(count);
		for(int i=0; i<count;i++)
		{
			WebElement e1 = alllinks.get(i);
			String link = e1.getAttribute("href");
			String text = e1.getText();
			System.out.println(link);
			System.out.println(text);
			verifylink(link);
		}
	}
		static void verifylink(String link) throws IOException
		{
			try {

			URL u1 = new URL(link);
			HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();
			if(h1.getResponseCode()==200 || h1.getResponseCode()==201)
			{
				System.out.println("Valid link");
				System.out.println(h1.getResponseCode());
				System.out.println(h1.getResponseMessage());
			}
			else
			{
				System.out.println("Link invalid");
				System.out.println(h1.getResponseCode());
			}

		}
		catch(MalformedURLException m1)
		{
			System.out.println("handled exception");
		}

		}
}