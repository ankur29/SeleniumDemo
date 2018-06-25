package busineesUtilities;

import genericUtilities.PerformAction;
import objectRepository.HomePage;

public class SignUpAccount {
	
	
	public static void create(){
		PerformAction.clickButton("HOME_LINK_CREATEACCOUNT_XPATH",HomePage.HOME_LINK_CREATEACCOUNT_XPATH);
	}

}
