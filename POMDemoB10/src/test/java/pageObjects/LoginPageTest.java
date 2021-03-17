package pageObjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

import org.openqa.selenium.WebElement;

public class LoginPageTest extends TestBase {
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
//	@FindBy(linkText="Forgot your password")
	//WebElement forgotLink;
	
	public LoginPageTest() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void login(String strName, String strPwd) {
		username.sendKeys(strName);
		pwd.sendKeys(strPwd);
		loginBtn.click();
		
	}
/*	public void forgotPwd() {
		forgotLink.click();
	}*/

	
	

}
