package stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountCreation;
import pages.AuthenticationPage;


public class InvalidRegistrationSteps {
	public static WebDriver driver;
	AuthenticationPage  objAuthentication;
	AccountCreation objAccountCreation;

	
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objAuthentication = PageFactory.initElements(driver,AuthenticationPage.class);
		driver.get("http://automationpractice.com/");
	}
	
	public void tearDown() throws Exception {
		driver.close();
	}
	
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		  setUp();
	    
	}

	@Given("user is on the authentication page")
	public void user_is_on_the_authentication_page() {
		objAuthentication.clickSignIn1Button();
		objAuthentication.verifyPageLoaded();
	}

	@When("user enters an existing email")
	public void user_enters_an_existing_email() {
		objAuthentication.setEmailAddress1TextField("tlt@yahoo.com");
	}

	@When("click on the create an account button")
	public void click_on_the_create_an_account_button() {
		objAuthentication.clickCreateAnAccountButton();
	}

	@Then("user is not navigated to the create an account page")
	public void user_is_not_navigated_to_the_create_an_account_page() throws InterruptedException {
		objAuthentication.verifyPageLoaded();
		Thread.sleep(3000);
		Boolean isShown = objAuthentication.verifyErrorMessageIsShown();
		Assert.assertTrue(isShown);
	}


}
