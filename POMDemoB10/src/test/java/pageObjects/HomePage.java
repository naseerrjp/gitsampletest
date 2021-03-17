package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{

	//@FindBy(xpath="//span[@class='user-display']")
	@FindBy(className = "user-display")
	WebElement userLogged;
	
	@FindBy(className = "ui linkedin button")
	WebElement newContactBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public boolean isValidUser() {
		return userLogged.isDisplayed();
	}
	public void createNewContact() {
		
		newContactBtn.click();
		
	}
	
}
