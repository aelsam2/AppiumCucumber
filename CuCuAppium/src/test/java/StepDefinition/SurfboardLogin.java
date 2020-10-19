package StepDefinition;

import java.io.IOException;
import org.openqa.selenium.WebElement;

import PageObject.SurfboardHomePage;
import PageObject.SurfboardLoginPage;
import PageObject.SurfboardMyProfilePage;
import PageObject.SurfboardSettingsPage;
import capabilities.DesiredCap;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SurfboardLogin {
	AndroidDriver<WebElement> driver;
	SurfboardLoginPage loginPage;
	SurfboardHomePage homePage;
	SurfboardMyProfilePage myProfilePage;
	SurfboardSettingsPage settingsPage;

	DesiredCap cap =new DesiredCap();
	@Before()
	public void beforeEach() throws IOException, InterruptedException {
		driver=cap.openSurfboard();
		loginPage =new SurfboardLoginPage(driver);
		homePage = new SurfboardHomePage(driver);
		myProfilePage = new SurfboardMyProfilePage(driver);
		settingsPage = new SurfboardSettingsPage(driver);
		loginPage.clickLocationAllowButton();
	}
	
	@After()
	public void afterEach() throws IOException, InterruptedException {
		homePage.myProfile_icon.click();
		Thread.sleep(3000);
		myProfilePage.setting_icon.click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Logout\"));");
		settingsPage.logOut_btn.click();
		settingsPage.logOut_yes_btn.click();

	}

	
	@Given("User is in login page")

	public void user_is_in_login_page() throws InterruptedException {

		Thread.sleep(3000);
		loginPage.clickIHaveAnAccountButton();

	}

	@When("User clicks continue button after selecting country (.*) and entering phone number (.*)$")
	public void user_clicks_continue_button_after_selecting_country_and_entering_phone_number(String countryCode,String phoneNumber) throws InterruptedException {
		loginPage.selectCountryCode(countryCode);
		loginPage.enterPhoneNumber(phoneNumber);
	}

	@When("User clicks Continue button after entering OTP in OTP field")
	public void user_clicks_continue_button_after_entering_otp_in_otp_field() throws InterruptedException {
		loginPage.enterOTP();
	}
	
	@Then("User is redirected to the home page")
	public void user_is_redirected_to_the_home_page() throws InterruptedException {
		Thread.sleep(4000);
		homePage.mostRecent_heading.isDisplayed();
		homePage.topTrending_heading.isDisplayed();
	}

}
