package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Comman;

public class Register extends Comman{
	
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement btnregisterlink;
	
	@FindBy(xpath="//h1[@class='entry-title']")
	WebElement entrytitle;
	
	@FindBy(xpath="//input[@id='user_login']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='user_email']")
	WebElement emailaddress;
	
	@FindBy(xpath="//input[@id='wp-submit']")
	WebElement btnregister;
	
	@FindBy(xpath="//input[@id='user_pass']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='wp-submit']")
	WebElement btnlogin;
		
	
	
	public Register()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateRegisterPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage RegisterPage(String user, String email, String pass)
	{
		myaccount.click();
		btnregisterlink.click();
		username.sendKeys(user);
		emailaddress.sendKeys(email);
		btnregister.click();
		username.clear();
		username.sendKeys(user);
		password.sendKeys(pass);
		btnlogin.click();
		//driver.navigate().forward();
		return new HomePage();
	}
	
	
	
}
