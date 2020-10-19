package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class SurfboardRegistrationPages {
	AndroidDriver<WebElement> driver;
	public  SurfboardRegistrationPages(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}

	@FindBy(id="com.bigvand.surfboard.develop:id/etDateOfBirth")
	public WebElement dobField;
	
	@FindBy(id="com.bigvand.surfboard.develop:id/picker_year")
	public WebElement yearWheel;
	
	@FindBy(id="com.bigvand.surfboard.develop:id/etFullName")
	public WebElement fullName_field;
	
	@FindBy(id="com.bigvand.surfboard.develop:id/etFullName")
	public WebElement userName_field;
	
	@FindBy(id="com.bigvand.surfboard.develop:id/etEmailAddress")
	public WebElement email_field;
	
	@FindBy(xpath="//*[contains(@text, 'Okay')]")
	public WebElement okay_btn;
	
	@FindBy(xpath="com.bigvand.surfboard.develop:id/etBio")
	public WebElement bio_field;
	
	
	@FindBy(id="com.bigvand.surfboard.develop:id/btnForwardButton")
	public WebElement continue_btn;
	
	@SuppressWarnings("rawtypes")
	public void DOBEntry() throws InterruptedException
	{
		 TouchAction touchActions = new TouchAction(driver);
		    PointOption pressOptions = PointOption.point(460,1062);
		    PointOption pressOptions2 = PointOption.point(660,1400);
		//for(int i=0; i==4; i++) {

				touchActions.press(pressOptions).waitAction().moveTo(pressOptions2).release().perform();
				touchActions.press(pressOptions).waitAction().moveTo(pressOptions2).release().perform();
				touchActions.press(pressOptions).waitAction().moveTo(pressOptions2).release().perform();
				touchActions.press(pressOptions).waitAction().moveTo(pressOptions2).release().perform();
				touchActions.press(pressOptions).waitAction().moveTo(pressOptions2).release().perform();
				touchActions.press(pressOptions).waitAction().moveTo(pressOptions2).release().perform();
				//dobField.sendKeys();
		//}
	   
	    Thread.sleep(2000);
	    continue_btn.click();
	}
public void fullNameEntry(String Fullname) throws InterruptedException {
	Thread.sleep(2000);
	fullName_field.sendKeys(Fullname);
	continue_btn.click();
}
public void UserNameEntry(String userName) throws InterruptedException {
	Thread.sleep(2000);
	userName_field.sendKeys(userName);
	continue_btn.click();
}
public void EmailEntry(String EmailAddress) throws InterruptedException {
	Thread.sleep(2000);
	email_field.sendKeys(EmailAddress);
	continue_btn.click();
}
public void BioEntry(String bio) throws InterruptedException {
	Thread.sleep(2000);
	okay_btn.click();
	email_field.sendKeys(bio);
	continue_btn.click();
}
}
