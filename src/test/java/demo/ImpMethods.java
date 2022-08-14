package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImpMethods {

	WebDriver driver;
	
	//@BeforeClass
	@BeforeSuite
	
	public void initialization()
	{
		System.setProperty("webdriver,chrome,driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///E:/Java%20Kiran%20sw/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	}
	
	//@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
	@Test(priority = 1)
	public void titleCheck()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "JavaByKiran | Dashboard");
	}
	@BeforeGroups
	@Test(priority = -1)
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		String actmsg=driver.findElement(By.xpath("//b[text()='Java By Kiran']")).getText();
		Assert.assertEquals(actmsg, "Java By Kiran");
	}
	@Test(groups = {"Dashboard"},priority = 3)
	public void dashboardPage()
	{
		String titleDasboard=driver.getTitle();
		System.out.println(titleDasboard);

	}
	@Test(groups = {"Dashboard"},priority = 4)
	public void dashboardSelenium()
	{
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();
	}
	@Test(groups = {"Dashboard"},priority = 5)
	public void dashboardJava()
	{
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();
	}
	

}
