package cpm.qa.testpages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Comman;
import com.qa.pages.AddToCartPage;
import com.qa.pages.CheckoutPage;
import com.qa.pages.HomePage;
import com.qa.pages.Login;
import com.qa.pages.Register;

public class AddToCartPageTest extends Comman{
	
//	Register register;
	//Login login;
	HomePage homepage;
	CheckoutPage checkout;
	AddToCartPage addtocart;
	
	public AddToCartPageTest ()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		intialize();
		//register = new Register();
		//login= new Login();
		homepage = new HomePage();
		addtocart = new AddToCartPage();
		
		
	}
	@Test
	public void VerifypriceTest()
	{
		addtocart.VerifyPrice();
		
	}
	
	@Test
	public void ValidateButtonTest()
	{
		addtocart.ValidateAddToCartButton();
		//return CheckoutPage();
	}

}
