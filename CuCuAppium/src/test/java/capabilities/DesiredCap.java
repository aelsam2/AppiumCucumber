package capabilities;

import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import config.Property;
import io.appium.java_client.android.AndroidDriver;

public class DesiredCap{
	 AndroidDriver<WebElement> driver;
	 Property prop =new Property();
    

	public  AndroidDriver<WebElement> openSurfboard() throws IOException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo y17");
		cap.setCapability("udid", "UC4PDAVKROBQFM7T");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "com.bigvand.surfboard.develop");
		cap.setCapability("appActivity", "com.bigvand.surfboard.view.splashScreen.SplashScreenActivity");
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		driver= new AndroidDriver<WebElement>(url, cap);
		return driver;
		
		}
	}


