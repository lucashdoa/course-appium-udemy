package session3;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;

/**
 * 
 * @author lucas
 * @course Testes funcionais de aplicações Android com Appium - Francisco Wagner Aquino
 * @lesson 15 - EditText
 */

public class Lesson15 {
	@Test
	public void lesson15() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("autoGrantPermissions", "true");
		// TO DO: Deixar o caminho do arquivo relativo ao projeto
		capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\lucas\\Projects\\course-appium-udemy\\src\\main\\resources\\CTAppium_1_2.apk");
		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
		// NOTE: Necessário setar a espera implicita para 10 segundos para o teste não falhar ao tentar encontrar elementos
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/* ------------ Selecionar formulário ---------- */
		
		// NOTE: Seleciona apenas os elementos visíveis na tela
		List<MobileElement> foundElements = driver.findElements(By.className("android.widget.TextView"));
		for(MobileElement element: foundElements) {
			System.out.println(element.getText());
		}
		foundElements.get(1).click();
		
		/* ---------- Escrever nome ---------- */
		MobileElement nameField = driver.findElement(MobileBy.AccessibilityId("nome"));
		nameField.sendKeys("Lucas");
		
		/* ---------- Checar nome escrito ---------- */
		String name = nameField.getText();
		Assert.assertEquals("Lucas", name);
		driver.quit();
	}

}
