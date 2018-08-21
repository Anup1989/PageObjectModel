package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.TestUtil;

public class Comman {
	public static WebDriver driver;
	public static Properties prop;
	
	public Comman()
	{
		prop= new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("/Users/anupkapale/Downloads/Automation work/DemoSite/src/main/java/com/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void intialize()
	{
		String browsername = prop.getProperty("browsername");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/anupkapale/Downloads/chromedriver");
			 driver = new ChromeDriver();
			 
		}else if (browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecho.driver","/Users/anupkapale/Downloads/Automation work/DemoSite/drivers/geckodriver");
			 driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	

}
