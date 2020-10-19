package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SurfboardHomePage {

	AndroidDriver<WebElement> driver;
	public SurfboardHomePage(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}

	@FindBy(xpath="//*[contains(@text,'Most Recent')]")
	public WebElement mostRecent_heading;
	
	@FindBy(xpath="//*[contains(@text,'Top Trending')]")
	public WebElement topTrending_heading;
	
	@FindBy(id="com.bigvand.surfboard.develop:id/MyProfileFragment")
	public WebElement myProfile_icon;
	
	
}
