package com.qa.util;

import org.openqa.selenium.WebDriver;

import com.qa.Base.Comman;

public class TestUtil extends Comman{

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT =10;
	public static WebDriver driver;
	
	public void switchtoframe()
	{
		driver.switchTo().frame("mainepanel");
	}

}
