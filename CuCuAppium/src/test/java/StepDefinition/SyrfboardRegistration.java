package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import PageObject.SurfboardHomePage;
import PageObject.SurfboardLoginPage;
import PageObject.SurfboardMyProfilePage;
import PageObject.SurfboardRegistrationPages;
import PageObject.SurfboardSettingsPage;
import capabilities.DesiredCap;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class SyrfboardRegistration {
	AndroidDriver<WebElement> driver;
	SurfboardLoginPage loginPage;
	SurfboardHomePage homePage;
	SurfboardMyProfilePage myProfilePage;
	SurfboardSettingsPage settingsPage;
	SurfboardRegistrationPages registrationPage;
	DesiredCap cap =new DesiredCap();
	
	
	@Before
	public void beforeEachReg() throws InterruptedException, IOException{
		
		driver=cap.openSurfboard();
		loginPage =new SurfboardLoginPage(driver);
		homePage = new SurfboardHomePage(driver);
		myProfilePage = new SurfboardMyProfilePage(driver);
		settingsPage = new SurfboardSettingsPage(driver);
		registrationPage =new SurfboardRegistrationPages(driver);
		loginPage.clickLocationAllowButton();
		Thread.sleep(3000);
		
	}
	
	@After
	public void afterEachReg() throws InterruptedException{
		homePage.myProfile_icon.click();
		Thread.sleep(3000);
		myProfilePage.setting_icon.click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Logout\"));");
		settingsPage.deleteAccount();
	}
	
	@Given("User is in login page and click Sign up button")
	public void user_is_in_login_page_and_click_sign_up_button() {
		
		loginPage.signUp_btn.click();
	}

	@When("^User selects DOB and click continue button$")
	public void user_selects_dob_and_click_continue_button() throws InterruptedException {
		Thread.sleep(2000);
		registrationPage.DOBEntry();
	}
	
	@When("^User gives Full Name (.*) and click continue button$")
	public void user_gives_full_name_and_click_continue_button(String fullName) throws InterruptedException {
		registrationPage.fullNameEntry(fullName);
	}

	@When("^User gives available Username (.*) and click continue button$")
	public void user_gives_available_username_and_click_continue_button(String userName) throws InterruptedException {
		registrationPage.UserNameEntry(userName);
	}


	@When("^User gives valid not used email address (.*) and click continue button$")
	public void user_gives_valid_not_used_email_address_and_click_continue_button(String emailAdrress) throws InterruptedException {
		registrationPage.EmailEntry(emailAdrress);
	}

	@When("^User gives unregistered phonenumber (.*) with country code (.*) and click continue button$")
	public void user_gives_unregistered_phonenumber_and_click_continue_button(String phoneNumber, String countryCode) throws InterruptedException {
	    Thread.sleep(2000);
	    loginPage.selectCountryCode(countryCode);
		loginPage.enterPhoneNumber(phoneNumber);
	}

	@When("User clicks Continue button after entering OTP in OTP field and click continue button")
	public void user_clicks_continue_button_after_entering_otp_in_otp_field_and_click_continue_button() throws InterruptedException {
		loginPage.enterOTP();
	}

	@When("^User gives bio (.*) and uploaded DP and click continue button$")
	public void user_gives_bio_and_uploaded_dp_and_click_continue_button(String bio) throws InterruptedException {
		registrationPage.BioEntry(bio);
	}

	@Then("User is redirected to the home page")
	public void user_is_redirected_to_the_home_page() throws InterruptedException {
		Thread.sleep(4000);
		homePage.mostRecent_heading.isDisplayed();
		homePage.topTrending_heading.isDisplayed();
	}

}
