package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SurfboardMyProfilePage {
	AndroidDriver<WebElement> driver;
	public SurfboardMyProfilePage(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}

	@FindBy(id="com.bigvand.surfboard.develop:id/imMore")
	public WebElement setting_icon;
	
}
