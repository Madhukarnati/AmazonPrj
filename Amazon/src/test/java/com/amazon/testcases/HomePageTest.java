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
import com.amazon.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	

	public HomePageTest() {
		super();
	}

	// test cases should be separated -- independent with each other
	// before each test case -- launch the browser and login
	// @test -- execute test case
	// after each test case -- close the browser

	@BeforeClass
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	/*
	 * @Test(priority=1) public void verifyHomePageTitleTest() { String
	 * homePageTitle = homePage.verifyHomePageTitle();
	 * Assert.assertEquals(homePageTitle, "CRMPRO","Home page title not matched"); }
	 * 
	 * @Test(priority=2) public void verifyUserNameTest(){ testUtil.switchToFrame();
	 * Assert.assertTrue(homePage.verifyCorrectUserName()); }
	 * 
	 * @Test(priority=3) public void verifyContactsLinkTest(){
	 * testUtil.switchToFrame(); contactsPage = homePage.clickOnContactsLink(); }
	 */

	@Test(priority = 1)
	public void verifyhamburgermenuicon() {
		homePage.clickOnHamburgerMenuicon();
	}

	@Test(priority = 2)
	public void verifywomensfashion() {
		homePage.clickOnWomensFashion();
	}

	@Test(priority = 3)
	public void verifyclothing() {
		homePage.clickOnClothing();
	}

	@Test(priority = 4)
	public void clickOnDresses() {
		homePage.clickOnDresses();
	}

	@Test(priority = 5)
	public void clickOnMilumia() {
		homePage.clickOnMilumia();
	}

	@Test(priority = 6)
	public void clickOnPrice() {
		homePage.clickOnPrice();
	}

	@Test(priority = 7)
	public void selectRating() {
		homePage.selectRating();
	}

	@Test(priority = 8)
	public void selectProduct() {
		homePage.productSelection();
	}

	@Test(priority = 9)
	public void selectSize() {
		homePage.selectSize();
	}

	@Test(priority = 10)
	public void addtoCart() {
		homePage.clickonAddtocart();
	}

	@Test(priority = 11)

	public void clickOnCartButton() {
		homePage.clickOnCartButton();
	}
	
	@Test(priority = 11)
	public void validateItem1_Cart() {
		homePage.validateProduct_cart();
	}

	@Test(priority = 12)
	public void selectQty() {
		homePage.selectQty();
	}

	@Test(priority = 13)
	public void verifyhamburgermenuicon2() {
		homePage.clickOnHamburgerMenuicon2();
	}

	@Test(priority = 14)
	public void clockOnElectronics() {
		homePage.clockOnElectronics();
	}

	@Test(priority = 15)
	public void clockOnAccessories() {
		homePage.clickOnAccessories();
	}

	@Test(priority = 16)
	public void clickOnnBrands() {
		homePage.clickOnnBrands();
	}

	@Test(priority = 17)
	public void selectPrice2() {
		homePage.selectPrice2();
	}

	@Test(priority = 18)
	public void prodSelection_Electronics() {
		homePage.productSelection_Electronics();
	}

	@Test(priority = 19)
	public void addtoCart_Electronics() {
		homePage.clickonAddtocart();
	}

	@Test(priority = 20)
	public void clickOnCartButton1() {
		homePage.clickOnCartButton();
	}

	@Test(priority = 21)
	public void validateItem2_Cart() {
		homePage.validateProduct_cart();
	}

	@AfterClass
	public void tearDown() {
		 driver.quit();
	}

}
