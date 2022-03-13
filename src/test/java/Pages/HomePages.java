package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages
{
	//define locators
	@FindBy(name = "email")
	public WebElement email;
	
	@FindBy (name = "password")
	public WebElement password;
	
	@FindBy (xpath = "//span[text() ='Continue']/ancestor::button")
	public WebElement clickContinue;

	//constructor method
	
	public HomePages (RemoteWebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}


	//operation and observation
	
	public void Fillname(String x)
	{
		email.sendKeys(x);
	}
	public void Fillpassword(String x)
	{
		password.sendKeys(x);
	}
	
	public void clickcontinue() throws Exception
	{
		clickContinue.click();
		Thread.sleep(8000);
	}
}
