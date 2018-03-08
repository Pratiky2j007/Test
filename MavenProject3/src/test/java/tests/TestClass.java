package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestClass 
{
	WebDriver fDriver;
	@BeforeMethod
	public void Login()
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		fDriver=new FirefoxDriver();
		fDriver.get("http://opensource.demo.orangehrmlive.com/");
	}
	
	@Test
	public void Test1()
	{
		fDriver.findElement(By.id("txtUsername")).sendKeys("admin");
		fDriver.findElement(By.id("txtPassword")).sendKeys("admin");
	}
	
	@AfterMethod
	public void Close()
	{
		fDriver.quit();
	}

}
