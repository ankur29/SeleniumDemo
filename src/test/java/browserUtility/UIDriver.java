package browserUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class UIDriver {

	public static WebDriver driver;
	/**
	 * 
	 */
	//launch Application
	public static void hitApplicationUrl(String appUrl,int implicitWait) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
		driver.get(appUrl);
	}

}
