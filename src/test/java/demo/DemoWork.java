package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoWork {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void initialization()
	{
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void test01()
	{
		System.out.println(driver.getTitle());
		driver.findElement(By.id("src")).clear();
		driver.findElement(By.id("src")).sendKeys("Pune");
		List element=driver.findElements(By.className("db"));
		System.out.println(element.size());
		System.out.println("************");
		System.out.println(element.toString()); 
		
		for  (Object object : element) {
			object.equals(element);
			
			
		}
	}

}
