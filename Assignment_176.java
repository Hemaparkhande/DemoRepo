package TestNG_Package;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_176
{
@BeforeMethod
public void BeforeMethod()
{
	System.out.println("BeforeMethod");
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
