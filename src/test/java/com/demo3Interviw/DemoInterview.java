package com.demo3Interviw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoInterview {
	
	WebDriver driver;
	@BeforeMethod
	//@Test
	
	public void initializatiuon()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.invisalign.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("find_a_doctor_zip")).sendKeys("123456789");
		//driver.findElement(By.xpath("//a[text()='Go']")).click();
		
		
	}
	
	@Test
	public void test02()
	{
		Actions action=new Actions(driver);
		
		WebElement element1=driver.findElement(By.xpath("//span[text()='How Invisalign Works']/parent::span"));
		WebElement element2=driver.findElement(By.xpath("//span[text()='How Invisalign Works']/parent::a"));
		action.moveToElement(element1).perform();
		action.moveToElement(element2).click();
	}

}
