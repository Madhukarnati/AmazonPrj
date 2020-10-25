package com.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	/*
	 * @Test(priority=1) public void loginPageTitleTest(){ String title =
	 * loginPage.validateLoginPageTitle(); Assert.assertEquals(title, "amazon"); }
	 */
	@Test(priority = 1)
	public void verifyAmazonLogo() {
		boolean flag = loginPage.validateAmazonLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
