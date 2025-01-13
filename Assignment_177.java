package TestNG_Package;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment_177
{
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}

	@Test
	public void Test1()
	{
		System.out.println("Test1");
	}

	@Test
	public void Test2()
	{
		System.out.println("Test2");
	}
	@Test
	public void Test3()
	{
		System.out.println("Test3");
	}

}
