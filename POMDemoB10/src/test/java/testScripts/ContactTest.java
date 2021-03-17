package testScripts;
import org.junit.Assert;
import org.testng.annotations.*;

import base.TestBase;
import pageObjects.HomePage;
import pageObjects.LoginPageTest;



public class ContactTest extends TestBase{
	LoginPageTest loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setup() {
		TestBase.initialize();
	}
	@Test
	public void newwContactTest() {
		loginPage = new LoginPageTest();
		homePage = new HomePage();
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		boolean validUser = homePage.isValidUser();
		
		Assert.assertTrue(validUser);
		homePage.createNewContact();
	}

	
	
	
}