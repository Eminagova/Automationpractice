package stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountCreation;
import pages.AuthenticationPage;
import pages.CartSummaryPage;
import pages.CategoryPage;
import pages.ItemPage;
import pages.MyAccountPage;
import pages.WomenPage;

public class AddProductToCartSteps {
	public static WebDriver driver;
	AuthenticationPage  objAuthentication;
	AccountCreation objAccountCreation;
	MyAccountPage objMyAccountPage;
	CategoryPage objCategoryPage;
	WomenPage objWomenPage;
	ItemPage objItemPage;
	CartSummaryPage objCartSummaryPage;
	
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
	
	public void tearDown() throws Exception {
		driver.close();
	}


	@Given("user is loged in")
	public void user_is_loged_in() throws InterruptedException {
		setUp();
		objAuthentication.clickSignIn1Button();
		objAuthentication.verifyPageLoaded();
		objAuthentication.setEmailAddress2TextField("test1@yahoo.com");
		objAuthentication.setPasswordPasswordField("123abc");
		objAuthentication.clickSignIn2Button();
	}

	@When("user click a product")
	public void user_click_a_product() {
		objMyAccountPage.verifyPageLoaded();
		objMyAccountPage.clickWomen1Link();
		
		objWomenPage.verifyPageLoaded();
		objWomenPage.clickTops3Link();
		
		objCategoryPage.verifyPageLoaded();
		objCategoryPage.clickFadedShortSleeveTshirtsLink();
		
	}

	@When("click on the add to cart")
	public void click_on_the_add_to_cart() {
		objItemPage.verifyPageLoaded();
		objItemPage.clickAddToCartButton();
		objItemPage.clickProceedToCheckoutLink();
	}

	@Then("the product is added to cart")
	public void the_product_is_added_to_cart() {
		objCartSummaryPage.verifyPageLoaded();
	}

}
