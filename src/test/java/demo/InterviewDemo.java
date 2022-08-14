package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InterviewDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void browserInitialisation()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.orangehrm.com/");
	}
	@Test
	
	public void test01()
	{
		String title=driver.getTitle();
		System.out.println(title);
		WebElement ele=driver.findElement(By.xpath("//*[@class='btn-orange trial-btn pulse ']"));
		String bgcolour= ele.getCssValue("background-color");
		System.out.println(bgcolour);
		String hexcolour=Color.fromString(bgcolour).asHex();
		System.out.println(hexcolour);
	}
	@Test
	public void test02() throws IOException
	{
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//a[@class='link'][normalize-space()='Platform']"));
		WebElement ele1=driver.findElement(By.xpath("//p//a[text()='Employee Management' ]"));
		
	action.moveToElement(ele).perform();
	action.moveToElement(ele1).click().perform();
	
	TakesScreenshot screenshot=(TakesScreenshot) driver;
	File src=screenshot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("E:\\scrennshot.png"));
	}
	
	@Test
	
	public void test03()
	{
		String str=driver.findElement(By.xpath("//h5[text()='About Us']")).getText();
		System.out.println(str);
		driver.findElement(By.xpath("//a[text()='Book a Free Demo']")).click();
		//driver.findElement(By.linkText("Book a Free Demo")).click();
		//driver.findElement(By.partialLinkText("Contact")).click();
	}
	@Test
	public void  useOfCss()
	{
		//driver.get("https://blazedemo.com/");
		WebElement button=driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		
		String colour=button.getCssValue("background-color");
		System.out.println(colour);
		String hexColour=Color.fromString(colour).asHex();
		System.out.println(hexColour);
		
	}
	@AfterMethod
	
	public void closeBrowser()
	{
		driver.close();
	}

}
