package stepsDefinition;

import static org.junit.Assert.assertTrue;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountCreation;
import pages.AuthenticationPage;
import pages.MyAccountPage;


public class AccountSteps {
	WebDriver driver;
	AuthenticationPage  objAuthentication;
	AccountCreation objAccountCreation;
	MyAccountPage objMyAccountPage;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objAuthentication = PageFactory.initElements(driver, pages.AuthenticationPage.class);
		AccountCreation objAccountCreation = PageFactory.initElements(driver, pages.AccountCreation.class);
		driver.get("http://automationpractice.com/");
	}
	
	public void tearDown(){
    	driver.close();
    	
    }
	
	private String getRandomEmail(){
		Random random = new Random();
		int intRandom = random.nextInt(900000000); 
		return "rgtest" + intRandom + "@local.com";
	}
	

	@Given("user is on the registration page")
	public void user_is_on_the_registration_page() {
		setUp();
		objAuthentication.clickSignIn1Button();
	    
	}

	@When("user enters email")
	public void user_enters_email() {
		String email = getRandomEmail();
	    objAuthentication.setEmailAddress1TextField(email);
	}

	@When("click on the create an account")
	public void click_on_the_create_an_account() {
	    objAuthentication.clickCreateAnAccountButton();
	}
	
	@Then("user is navigated to the create an account page")
	public void user_is_navigated_to_the_create_an_account_page() {
		objAccountCreation.verifyPageLoaded();
	    
	}

	@Then("fill all required fields")
	public void fill_all_required_fields() {
		objAccountCreation.verifyPageLoaded();
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
	}

	@Then("user should be successfully created")
	public void user_should_be_successfully_created() {
		Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("My account - My Store");
		assertTrue(verifyTitleIsPresent);
		tearDown();
	}



}
