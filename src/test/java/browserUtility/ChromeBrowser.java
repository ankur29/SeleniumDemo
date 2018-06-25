package browserUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ChromeBrowser extends UIDriver implements Browsers {

	public void initiateBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:/drivers/New folder (2)/chromedriver.exe");
         driver = new ChromeDriver();
	}

	

}
