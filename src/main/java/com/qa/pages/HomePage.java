package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Comman;

public class HomePage extends Comman  {

	
		@FindBy(xpath="//a[contains(text(),'Home')]")
		WebElement hometab;
		
		@FindBy(xpath="//a[contains(text(),'Product Category')]")
		WebElement producttab;
		
		@FindBy(xpath="//a[contains(text(),'Accessories')]")
		WebElement accessorieslink;
		
		@FindBy(xpath="//*[@class='buynow']")
		WebElement btnBuyNow;
		
		@FindBy(xpath="//img[@src='http://store.demoqa.com/wp-content/uploads/2014/08/Tools-QA-2.png']")
		WebElement logo;
		
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public String VerifyTitle()
		{
			return driver.getTitle();
		}
		
		public boolean Verifylogo()
		{
			return logo.isDisplayed();
			
		}
		
		public void Scrollpage()
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
		}
		
		public void ValidateTabs()
		{
			hometab.click();
			producttab.click();
			hometab.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		public void ValidateBuyNowbutton()
		{
			btnBuyNow.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
}
