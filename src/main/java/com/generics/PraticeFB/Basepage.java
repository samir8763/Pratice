package com.generics.PraticeFB;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Basepage 
{
	public void selectbyvisibletext(WebElement element,String text)
	{ 
		Select sel=new Select(element);
		sel.deselectByVisibleText(text);
		
		
	}
	public void alertconfirm(WebDriver driver)
{
	Alert alt=driver.switchTo().alert();
	alt.accept();
}
	public void dimensionchange(WebDriver driver,int a,int b) 
	{
		Dimension d=new Dimension(a, b);
		driver.manage().window().setSize(d);
		
	}
	public void selectall() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
	}
	public void isselected(WebElement element)
	{
		System.out.println(element.isSelected());
	}
}
