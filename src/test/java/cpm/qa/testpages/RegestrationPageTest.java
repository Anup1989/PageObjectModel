package cpm.qa.testpages;




import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.Comman;
import com.qa.pages.HomePage;
import com.qa.pages.Login;
import com.qa.pages.Register;

public class RegestrationPageTest extends Comman {
	Register register;
	Login login;
	HomePage homepage;
	
	
	public RegestrationPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		intialize();
		login = new Login();
		register = new Register();
		homepage= new HomePage();
	}
	@Test
	public void RegisterPageTitleTest()
	{
		
		String title = register.ValidateRegisterPageTitle();
		System.out.println("Title of the page is :"+title);
	}
	
	@Test
	public void Registerdone()
	{
		homepage  = register.RegisterPage(prop.getProperty("username"), prop.getProperty("email"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDrown()
	{
		driver.quit();
	}
	
	 /*public static void main(String[] args) {
		
		RegestrationPageTest Rp= new RegestrationPageTest();
		Rp.setup();
		Rp.RegisterPageTitleTest();
		Rp.Registerdone();
	}
	*/
	
	
	
	
}
