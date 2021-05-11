package session3;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;

/**
 * 
 * @author lucas
 * @course Testes funcionais de aplicações Android com Appium - Francisco Wagner Aquino
 * @lesson 14 - Localizando Elementos
 */

public class Lesson14 {
	
	@Test
	public void lesson14() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("autoGrantPermissions", "true");
		capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\lucas\\Projects\\course-appium-udemy\\src\\main\\resources\\CTAppium_1_2.apk");
		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
		// Selecionar formulário 
		driver.quit();
	}
}
