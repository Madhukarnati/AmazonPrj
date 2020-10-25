package com.amazon.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;
import com.amazon.util.TestUtil;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(css="input[type='email']")
	WebElement username;
	
	@FindBy(css="input#continue")
	WebElement continueBtn;
	
	@FindBy(css="input[type='password']")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement Sign_in;
	
	@FindBy(id="nav-link-accountList")
	WebElement Sign_in_Navigator;
	
	@FindBy(xpath="//div[@id='nav-al-signin']//span[contains(text(), 'Sign in')]")
	WebElement Sign_in_Btn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(id="nav-logo")
	WebElement AmazonLogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateAmazonLogo(){
		 return AmazonLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		new Actions(driver).moveToElement(Sign_in_Navigator).pause(2000).moveToElement(Sign_in_Btn).click().perform();
		username.sendKeys(un);
		continueBtn.click();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		password.sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", Sign_in);
		    	
		return new HomePage();
	}
	
}
