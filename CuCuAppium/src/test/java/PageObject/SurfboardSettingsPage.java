package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SurfboardSettingsPage {
	AndroidDriver<WebElement> driver;
	public SurfboardSettingsPage(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}

	@FindBy(xpath="//*[contains(@text,'Logout')]")
	public WebElement logOut_btn;
	
	@FindBy(xpath="//*[contains(@text,'Yes')]")
	public WebElement logOut_yes_btn;
	
	@FindBy(xpath="//*[contains(@text,'Account Management')]")
	public WebElement account_management_btn;
	
	@FindBy(xpath="//*[contains(@text,'Delete')]")
	public WebElement delete_btn;
	
	@FindBy(xpath="//*[contains(@text,'Not enough users')]")
	public WebElement delete_option2_btn;
	
	@FindBy(xpath="//*[contains(@text,'There's not enough content')]")
	public WebElement delete_option2_ans;
	
	@FindBy(xpath="//*[contains(@text,'Delete')]")
	public WebElement delete_final_btn;
	
	public void deleteAccount() throws InterruptedException {
		account_management_btn.click();
		Thread.sleep(1000);
		delete_btn.click();
		Thread.sleep(1000);
		delete_option2_btn.click();
		Thread.sleep(1000);
		delete_option2_ans.click();
		delete_final_btn.click();
	}
	
}
