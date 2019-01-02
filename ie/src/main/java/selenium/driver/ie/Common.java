package selenium.driver.ie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Common {
	protected static WebDriver driver;

	protected static void pause(long millisec) {
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected static void setDriver() {
		System.setProperty("webdriver.ie.driver","C:\\Users\\hs_se\\github\\IEdriver\\ie\\driver\\IEDriverServer.exe");
		InternetExplorerOptions option = new InternetExplorerOptions();
		option.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, false);
		option.withInitialBrowserUrl("https://www.google.com/");
        driver = new InternetExplorerDriver(option);
	}
}
