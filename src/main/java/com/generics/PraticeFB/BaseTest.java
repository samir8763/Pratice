package com.generics.PraticeFB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest implements Autoconstant
{
	public static WebDriver driver;
	@BeforeSuite
	public void executionstart()
	{
		Reporter.log("execution start",true);
	}
@BeforeMethod
public void openbrowser()
{
	System.setProperty(chrome_key, chrome_value);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.navigate().to(url);
	driver.manage().window().maximize();
}
@AfterSuite
public void executioncomplete()
{
	Reporter.log("executioncomplete", true);
}
}
