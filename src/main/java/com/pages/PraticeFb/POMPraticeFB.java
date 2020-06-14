package com.pages.PraticeFb;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.generics.PraticeFB.Autoconstant;
import com.generics.PraticeFB.Basepage;
import com.generics.PraticeFB.ExcelLibrary;

public class POMPraticeFB extends Basepage implements Autoconstant
{
	public WebDriver driver;
@FindBy(xpath="//input[@data-testid='royal_email']")
private WebElement usernametextfield;
@FindBy(xpath="//input[@data-testid='royal_pass']")
private WebElement passwordtextfield;
@FindBy(xpath="(//input[@type='radio'])[1]")
private WebElement femaleradiobutton;

 public POMPraticeFB(WebDriver driver)
 {
	 this.driver=driver;
	 
	 PageFactory.initElements(driver, this);
 }
 public void loginMethod() throws IOException, InterruptedException
 {
	 usernametextfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, excelsheet, 1, 0));
	 passwordtextfield.sendKeys(ExcelLibrary.getcellvalue(excelpath, excelsheet, 1, 1));
	 femaleradiobutton.click();
	 isselected(femaleradiobutton);
	 Thread.sleep(3000);
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,500)");
	 
 }
}
