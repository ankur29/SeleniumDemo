package demoSel;

import java.security.Signature;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import browserUtility.SelectBrowser;
import browserUtility.UIDriver;
import busineesUtilities.SignUpAccount;

public class TestCase extends UIDriver {
	@BeforeClass
	public void launchApplication() {
		SelectBrowser.getBrowser("Chrome");
		UIDriver.hitApplicationUrl("http://www.gmail.com/",5);
		
	}

	@Test
	public static void userRegistration() {
		SignUpAccount.create();
	}
	@AfterClass
	public static void closeApplication() throws InterruptedException{
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
