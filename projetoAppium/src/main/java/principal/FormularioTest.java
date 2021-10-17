package principal;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FormularioTest {
	
	private WebDriver driver;

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {
		
		DesiredCapabilities capacidades = new DesiredCapabilities();
		capacidades.setCapability("deviceName", "Google Pixel 3");
		capacidades.setCapability("platform", "Android");
		capacidades.setCapability("udid", "192.168.56.101:5555");
		capacidades.setCapability("appPackage", "com.ctappium");
		capacidades.setCapability("appActivity", "com.ctappium.MainActivity");
		capacidades.setCapability(MobileCapabilityType.APP, "C:\\Users\\Lucas\\Desktop\\Curso Appium\\CTAppium_1_2.apk"); 
		
		WebDriver driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capacidades); //URL PEGA NO driverIUM
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		
		List<MobileElement> elementosEncontrados = driver.findElements(By.className("android.widget.TextView"));
		for(MobileElement elemento: elementosEncontrados) {
			System.out.println(elemento.getText());
			//isso foi feito porque a listagem do apk lista várias opções iguais
			//com isso ele vai apresentar a lista encontrada.
		}
				
		driver.quit();
	}
}