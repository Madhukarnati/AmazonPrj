package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import com.amazon.base.TestBase;
import com.amazon.util.TestUtil;

public class HomePage extends TestBase {

	// Initializing the Page Objects:

		// Amazon

	@FindBys({ @FindBy(xpath = "//h2[contains(text(), 'Amazon Music')]") })
	List<WebElement> amazonMusic_Page;
	
	@FindBys({ @FindBy(xpath = "//span[contains(@class, 'product-title')]") })
	List<WebElement> prodtile_cartPage;

	@FindBy(xpath = "//a[@id='nav-hamburger-menu']")
	WebElement hamburgermenuicon;

	@FindBy(css = ".a-star-medium-4")
	WebElement rating;

	@FindBy(xpath = "//div[@id='hmenu-content']//div[contains(text(), 'Women')][contains(text(), 'Fashion')]")
	WebElement womensfashion;

	@FindBy(xpath = "//ul[contains(@class, 'hmenu-visible')]//a[contains(@class, 'hmenu-item')][contains(text(), 'Clothing')]")
	WebElement clothing;

	@FindBy(xpath = "//div[@id='departments']//span[text() = 'Dresses']")
	WebElement category_Dresses;

	@FindBy(xpath = "(//span[contains(text(), 'Brand')]/following::span[contains(text(), 'Milumia')])[1]/preceding::div[1]//i")
	WebElement milumia;

	@FindBy(css = "#priceRefinements ul>li:nth-of-type(1) a>span")
	WebElement price;
	
	@FindBy(xpath = "(//div[contains(@class, 'search-results')]//h2)[1]//span")
	WebElement product_name;

	@FindBy(xpath = "(//div[contains(@class, 'search-results')]//img)[1]")
	WebElement selectProduct;

	@FindBy(css = "select[id^='native_dropdown']")
	WebElement selectSize;

	@FindBy(id = "add-to-cart-button")
	WebElement addToCart;

	@FindBy(xpath = "//a[@id='hlb-view-cart-announce']")
	WebElement cartButton;

	@FindBy(xpath = "//select[@name='quantity']")
	WebElement selectQty;

	@FindBy(xpath = "//a[@id='nav-hamburger-menu']")
	WebElement hamburgermenuicon2;

	@FindBy(xpath = "//div[@id='hmenu-content']//div[text()='Electronics']")
	WebElement electronics;

	@FindBy(xpath = "//div[@id='hmenu-content']//a[text()='Cell Phones & Accessories']")
	WebElement Accessories;

	@FindBy(xpath = "//span[text()='Featured Brands']//following::a[1]//i[contains(@class, 'checkbox')]")
	WebElement Brands;
	
	String prod_text="";

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	
	public void clickOnHamburgerMenuicon() {
		TestUtil.waitforElement(hamburgermenuicon);
		hamburgermenuicon.click();
	}

	public void clickOnWomensFashion() {
		TestUtil.waitforElement(womensfashion);
		new Actions(driver).moveToElement(womensfashion).click().perform();

	}

	public void clickOnClothing() {

		if (amazonMusic_Page.size() > 0) {
			clickOnHamburgerMenuicon();
			clickOnWomensFashion();
		}
		TestUtil.waitforElement(clothing);
		clothing.click();
	}

	public void clickOnDresses() {

		TestUtil.waitforElement(category_Dresses);
		category_Dresses.click();

	}

	public void clickOnMilumia() {
		TestUtil.waitforElement(milumia);
		new Actions(driver).moveToElement(milumia).pause(2000).click().perform();
		milumia.click();
	}

	public void clickOnPrice() {
		TestUtil.waitforElement(price);
		price.click();
	}

	public void selectRating() {
		TestUtil.waitforElement(rating);
		rating.click();
	}
	
	

	public void productSelection() {
		
		prod_text = product_name.getText();
		TestUtil.waitforElement(selectProduct);
		selectProduct.click();
	}

	public void selectSize() {
		TestUtil.waitforElement(selectSize);
		TestUtil.selectFrmDropdown(selectSize, "visibleText", "Small");
	}

	public void clickonAddtocart() {
		WebElement cart = null;
		try {
			TestUtil.waitforElement(addToCart);
			addToCart.click();
		} catch (Exception ex) {
			cart = addToCart;
			cart.click();
		}
	}

	public void clickOnCartButton() {
		TestUtil.waitforElement(cartButton);
		cartButton.click();
	}

	public void validateProduct_cart()
	{
		for(WebElement ele: prodtile_cartPage)
		{
			if(ele.getText().equalsIgnoreCase(prod_text))
			{
				System.out.println("Item added to cart successfully");
			}
		}
	}
	
	public void selectQty() {
		TestUtil.waitforElement(selectQty);
		TestUtil.selectFrmDropdown(selectQty, "visibleText", "5");
	}

	public void clickOnHamburgerMenuicon2() {
		TestUtil.waitforElement(hamburgermenuicon2);
		new Actions(driver).moveToElement(hamburgermenuicon2).click().perform();

	}

	public void clockOnElectronics() {
		TestUtil.waitforElement(electronics);
		electronics.click();
	}

	public void clickOnAccessories() {

		if (amazonMusic_Page.size() > 0) {
			clickOnHamburgerMenuicon();
			clickOnWomensFashion();
		}
		TestUtil.waitforElement(Accessories);
		Accessories.click();
	}

	public void clickOnnBrands() {
		TestUtil.waitforElement(Brands);
		Brands.click();
	}

	public void selectPrice2() {
		TestUtil.waitforElement(price);
		new Actions(driver).moveToElement(price).pause(2000).click().perform();
		// price.click();
	}
	
	public void productSelection_Electronics() {
		prod_text = product_name.getText();
		TestUtil.waitforElement(selectProduct);
		selectProduct.click();
	}
}
