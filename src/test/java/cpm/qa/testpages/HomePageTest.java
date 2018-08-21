package cpm.qa.testpages;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Comman;
import com.qa.pages.AddToCartPage;
import com.qa.pages.CheckoutPage;
import com.qa.pages.HomePage;
import com.qa.pages.Login;
import com.qa.pages.Register;

public class HomePageTest extends Comman {
	
	Register register;
	Login login;
	HomePage homepage;
	//CheckoutPage checkout;
	AddToCartPage addtocart;
	
	public HomePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		intialize();
		login = new Login();
		homepage =new HomePage();
		//checkout= new CheckoutPage();
		addtocart = new AddToCartPage();
		
	}
	
	@Test
	public void  HomePageTitle()
	{
		String title = homepage.VerifyTitle();
		System.out.println("Home Page Title is :"+title);
	}
	
	@Test
	public void ValidateHomePageLogo()
	{
		boolean flag= homepage.Verifylogo();
		AssertJUnit.assertTrue(flag);
		System.out.println(flag);
		
	}
	
	@Test
	public void Scrollthepage()
	{
		homepage.Scrollpage();
		
	}
	
	@Test
	public AddToCartPage BuyNowbutton()
	{
		 homepage.ValidateBuyNowbutton();
		return new AddToCartPage();
		
	}
	

	@AfterMethod
	public void tearDrown()
	{
		driver.quit();
	}
	

}
