package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Comman;
import com.qa.util.TestUtil;

public class AddToCartPage extends Comman {
	
	
	
	@FindBy(xpath="//input[@value='Add To Cart']")
	WebElement btnAddToCart;
	
	@FindBy(xpath="//span[@class='wpscsmall pricefloatright pricedisplay']")
	WebElement verifyprice;
	
	
	public AddToCartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void VerifyPrice()
	{
		String text= verifyprice.getText();
		System.out.println("Amount is dispayed as :"+text);
	}
	
	public void ValidateAddToCartButton()
	{
		TestUtil.PAGE_LOAD_TIMEOUT=20;
		String buttontext= btnAddToCart.getText();
		System.out.println(buttontext);
		btnAddToCart.click();
		
	}
	

}
