package principal;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FormularioTest {
	private WebDriver driver;

	@Test
	public void deveInstalarApk() throws MalformedURLException {
		
		DesiredCapabilities capacidades = new DesiredCapabilities();
		capacidades.setCapability("deviceName", "Google Pixel 3");
		capacidades.setCapability("platform", "Android");
		capacidades.setCapability("udid", "192.168.56.101:5555");
		capacidades.setCapability("driverPackage", "com.ctappium");
		capacidades.setCapability("driverActivity", "com.ctappium.MainActivity");
		capacidades.setCapability("driver", "C:\\Users\\Lucas\\Desktop\\Curso Appium\\CTAppium_1_2.apk"); 
		
		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidades); //URL PEGA NO driverIUM
		
		driver.quit();
	}
}