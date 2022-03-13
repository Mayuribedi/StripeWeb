package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationPages
{
	@FindBy(xpath = "//span[text() = 'Skip for now']/..")
	public WebElement skip;
	
	public VerificationPages (RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickskip() throws Exception
	{
		skip.click();
		Thread.sleep(8000);
	}
}
