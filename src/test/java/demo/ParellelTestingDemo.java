package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParellelTestingDemo {
	WebDriver driver;
	@Test
	public void test1()
	{
		System.out.println("this is 1 st test");
		System.setProperty("webdriver,chrome,driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///E:/Java%20Kiran%20sw/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	}
	@Test
	public void test2()
	{
		System.out.println("this is 2nd test");
		
		System.setProperty("webdriver,chrome,driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}

}
