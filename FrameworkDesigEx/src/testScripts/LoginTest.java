package testScripts;

import genericlib.Constants;
import genericlib.Controller;
import genericlib.WebdriverCommonlib;

import org.testng.annotations.Test;

public class LoginTest extends WebdriverCommonlib
{
	//LoginPage login;
	
	@Test
	public void verifyLogin()
	{
		
		Controller.driver.get(Constants.url);
		waitForpageToLoad();
		login.enterUserName(Constants.userid);
		login.enterpassword(Constants.password);
		login.clickSigninBtn();
		
	}
	
	
}
