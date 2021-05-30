package tests;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.AccountCreation;
import pages.AuthenticationPage;
import pages.CartSummaryPage;
import pages.CategoryPage;
import pages.ItemPage;
import pages.MyAccountPage;
import pages.WomenPage;

public class SignUpAndAddToCart {
	public static WebDriver driver;
	AuthenticationPage  objAuthentication;
	AccountCreation objAccountCreation;
	MyAccountPage objMyAccountPage;
	CategoryPage objCategoryPage;
	WomenPage objWomenPage;
	ItemPage objItemPage;
	CartSummaryPage objCartSummaryPage;


	@Before
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objAuthentication = PageFactory.initElements(driver,AuthenticationPage.class);
		driver.get("http://automationpractice.com/");
		objAccountCreation= PageFactory.initElements(driver,AccountCreation.class);
		objMyAccountPage= PageFactory.initElements(driver,MyAccountPage.class);
		objCategoryPage= PageFactory.initElements(driver,CategoryPage.class);
		objWomenPage= PageFactory.initElements(driver,WomenPage.class);
		objItemPage= PageFactory.initElements(driver,ItemPage.class);
		objCartSummaryPage= PageFactory.initElements(driver,CartSummaryPage.class);
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void createAnAccount() throws InterruptedException {
		objAuthentication.clickSignIn1Button();
		objAuthentication.verifyPageLoaded();
		Random random = new Random();
		int intRandom = random.nextInt(900000000); 
		String email = "rgtest" + intRandom + "@local.com";
		objAuthentication.setEmailAddress1TextField(email);
		objAuthentication.clickCreateAnAccountButton();
		objAccountCreation.setFirstName1TextField("Test");
		objAccountCreation.setLastName1TextField("Test");
		objAccountCreation.setPasswordPasswordField("123abc");
		objAccountCreation.setAddressTextField("Woltstr");
		objAccountCreation.setCityTextField("Phoenix");
		objAccountCreation.setStateDropDownListField("Arizona");
		objAccountCreation.setZippostalCodeTextField("00000");
		objAccountCreation.setCountryDropDownListField("United States");
		objAccountCreation.setMobilePhoneTextField("1234567890");
		objAccountCreation.setAssignAnAddressAliasForFutureTextField("My address");
		objAccountCreation.clickRegisterButton();
		
		objMyAccountPage.verifyPageLoaded();
		
	}
	
	@Test
	public void invalidRegistration() throws InterruptedException {
		objAuthentication.clickSignIn1Button();
		objAuthentication.verifyPageLoaded();
		objAuthentication.setEmailAddress1TextField("tlt@yahoo.com");
		objAuthentication.clickCreateAnAccountButton();
		objAuthentication.verifyPageLoaded();
		Thread.sleep(3000);
		Boolean isShown = objAuthentication.verifyErrorMessageIsShown();
		Assert.assertTrue(isShown);
	}
	
	@Test
	public void addProductToCart() {
		objAuthentication.clickSignIn1Button();
		objAuthentication.verifyPageLoaded();
		objAuthentication.setEmailAddress2TextField("test1@yahoo.com");
		objAuthentication.setPasswordPasswordField("123abc");
		objAuthentication.clickSignIn2Button();
		
		objMyAccountPage.verifyPageLoaded();
		objMyAccountPage.clickWomen1Link();
		
		objWomenPage.verifyPageLoaded();
		objWomenPage.clickTops3Link();
		
		objCategoryPage.verifyPageLoaded();
		objCategoryPage.clickFadedShortSleeveTshirtsLink();
		
		objItemPage.verifyPageLoaded();
		objItemPage.clickAddToCartButton();

		objCartSummaryPage.verifyPageLoaded();
		
		
	}
	



}