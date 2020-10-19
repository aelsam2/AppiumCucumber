package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SurfboardLoginPage {

	AndroidDriver<WebElement> driver;
	public SurfboardLoginPage(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}

	@FindBy(id="com.android.packageinstaller:id/permission_allow_button")
	WebElement location_allow_btn;

	@FindBy(id="com.bigvand.surfboard.develop:id/tvSignedUser")
	public WebElement i_have_an_account_btn;

	@FindBy(id="com.bigvand.surfboard.develop:id/rlClickConsumer")
	WebElement country_dropdown;

	@FindBy(id="com.bigvand.surfboard.develop:id/editText_search")
	WebElement country_search_fld;

	@FindBy(xpath="//*[contains(@text, 'India (IN)')]")
	WebElement india_search_result;

	@FindBy(id="com.bigvand.surfboard.develop:id/etPhoneNumber")
	WebElement phoneNumber_field;

	@FindBy(id="com.bigvand.surfboard.develop:id/btnForwardButton")
	WebElement phoneNumber_continue_btn;

	@FindBy(id="com.bigvand.surfboard.develop:id/etOTP1")
	WebElement otpBox1;

	@FindBy(id="com.bigvand.surfboard.develop:id/etOTP2")
	WebElement otpBox2;

	@FindBy(id="com.bigvand.surfboard.develop:id/etOTP3")
	WebElement otpBox3;

	@FindBy(id="com.bigvand.surfboard.develop:id/etOTP4")
	WebElement otpBox4;

	@FindBy(id="com.bigvand.surfboard.develop:id/etOTP5")
	WebElement otpBox5;

	@FindBy(id="com.bigvand.surfboard.develop:id/etOTP6")
	WebElement otpBox6;

	@FindBy(id="com.bigvand.surfboard.develop:id/btnForwardButton")
	WebElement login_otp_continue_btn;

	@FindBy(xpath="//*[contains(@text,'is your Surfboard code!')]")
	WebElement notificationMessage;
	
	@FindBy(xpath="//*[contains(@text,'Resend Code')]")
	WebElement resend_code_btn;
	
	@FindBy(id="com.bigvand.surfboard.develop:id/btnSignUp")
	public WebElement signUp_btn;

	public void clickLocationAllowButton()
	{
		location_allow_btn.click();
	}
	public void clickIHaveAnAccountButton()
	{
		i_have_an_account_btn.click();
	}
	public void selectCountryCode(String countryCode) throws InterruptedException
	{    
		country_dropdown.click();
		Thread.sleep(3000);
		country_search_fld.sendKeys(countryCode);
		india_search_result.click();
	}
	public void enterPhoneNumber(String phoneNumber)
	{
		phoneNumber_field.sendKeys(phoneNumber);
		phoneNumber_continue_btn.click();
	}
	public void enterOTP() throws InterruptedException
	{
		driver.openNotifications();
		Thread.sleep(15000);
		String otpmes=notificationMessage.getText();
		System.out.println(otpmes);
		String[] arrOfStr = otpmes.split(" ", 5);
		String str2= arrOfStr[0];
		String[]otpa= new String[6];
		for (int i = 0;i < str2.length(); i++){
			char a=str2.charAt(i);
			String otpass=Character.toString(a);
			otpa[i]=otpass;
		}


		driver.navigate().back();
		Thread.sleep(3000);
		otpBox1.sendKeys(otpa[0]);
		otpBox2.sendKeys(otpa[1]);
		otpBox3.sendKeys(otpa[2]);
		otpBox4.sendKeys(otpa[3]);
		otpBox5.sendKeys(otpa[4]);
		otpBox6.sendKeys(otpa[5]);
		login_otp_continue_btn.click();

	}

}
