package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class A {
	
	WebDriver driver;
	
	
	@Test
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@class='gb_d'and @data-pid='23']/parent::div[@class='gb_e gb_f']")).click();
		
	}

}
