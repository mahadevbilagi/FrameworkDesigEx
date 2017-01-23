package genericlib;

import java.util.concurrent.TimeUnit;

import objectRepo.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebdriverCommonlib 
{
	WebDriver driver;
	protected LoginPage login;
	
	@BeforeMethod
	public void configBeformtd() throws InterruptedException
	{
		//DOMConfigurator.configure("log4j.xml");
		//launch browser
		driver = Controller.getBrowser();
		login = PageFactory.initElements(driver, LoginPage.class);
		
	}
	
	@AfterMethod
	public void configAftermtd()
	{
		driver.quit();
	}
	public void waitForpageToLoad()
	{
		Controller.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public void waitForXpathToPresent(String wbXpath)
	{
		WebDriverWait wait = new WebDriverWait(Controller.driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(wbXpath)));
	}

	public void waitForNameToPresent(String wbName)
	{
		WebDriverWait wait = new WebDriverWait(Controller.driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name(wbName)));
	}


}