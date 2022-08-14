package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNgAttributes {
	WebDriver driver;
	@Test(groups = {"smoke"})
	public void test1()
	{
		System.out.println("This is 1st test");
	}
	@Test(groups = {"smoke"},priority = -1,dependsOnMethods = "browserInitiazation")
	public void test2()
	{
		System.out.println("This is 2nd test");
	}
	@Test(groups = {"smoke","sanity"},dependsOnMethods = "browserInitiazation")
	public void browserInitiazatiol()
	{
		System.out.println("This is 3rd test");
	}
	@Test(groups = {"sanity"})
	public void test4()
	{
		System.out.println("This is 4th test");
	}
	//@BeforeClass
	@BeforeGroups
	@Test(groups = {"smoke"})
	public void browserInitiazation()
	{
		System.out.println("this is initialization method");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@AfterGroups
	@Test(groups = {"smoke"})
	public void teardown()
	{
		System.out.println("browser closing");
		driver.close();
	}

}
