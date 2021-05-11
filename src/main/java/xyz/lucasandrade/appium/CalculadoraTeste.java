package xyz.lucasandrade.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class CalculadoraTeste {
	
	@Test
	public void testeUm() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("automationName", "uiAutomator2");
		capabilities.setCapability("app", "C:\\\\Users\\lucas\\Downloads\\calculator.apk");
		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
		Assert.assertEquals(false, true);
		driver.quit();
	}
	
	
}
