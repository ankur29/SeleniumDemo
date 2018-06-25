package browserUtility;

 public class SelectBrowser {
	
	public static void getBrowser(String browserName){
		if(browserName.equalsIgnoreCase("Chrome")){
			ChromeBrowser chrome =new ChromeBrowser();
			chrome.initiateBrowser();

		}else if(browserName.equalsIgnoreCase("Mozilla")){
			System.out.println("Mozilla");
		}else{
			System.out.println(browserName+" is not supported");
		}
	}

}
