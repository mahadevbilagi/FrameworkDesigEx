package objectRepo;

import genericlib.Constants;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	@FindBy(id="userName")
	private WebElement userNameEdt;
	
	@FindBy(id="password")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement signinBtn;
	
	public void enterUserName(String username)
	{
		userNameEdt.sendKeys(username);
	}
	
	public void enterpassword(String password)
	{
		passwordEdt.sendKeys(password);
	}
	
	public void clickSigninBtn()
	{
		signinBtn.click();
	}


}
