package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPages
{
  @FindBy (xpath ="//span[text() = 'Customers']")
  public WebElement customers;
  
  @FindBy (xpath = "//span[text() = 'Add customer']/..")
  public WebElement addcustomers;
  
  @FindBy (xpath = "(//input[@type='text'])[2]" )
  public WebElement name;
  
  @FindBy (name = "email")
  public WebElement email;
  
  @FindBy (name = "description")
  public WebElement description;
  
  @FindBy (xpath = "(//span[text() ='Add customer']/ancestor::button)[2]")
  public WebElement add;

  public CustomerPages (RemoteWebDriver driver)
{
	PageFactory.initElements(driver, this);
}

  public void clickcustomers() throws Exception
  {
	  customers.click();
	  Thread.sleep(5000);
  }
 
  public void Clickaddcutomers() throws Exception
  {
	  addcustomers.click();
	  Thread.sleep(8000);
  }

  public void Fillname(String x)
  {
	  name.sendKeys(x);
  }
  public void Fillemail(String x)
  {
	  email.sendKeys(x);
  }
  public void Filldiscription(String x)
  {
	  description.sendKeys(x);
  }
  public void Clickadd() throws Exception
  {
	  add.click();
	  Thread.sleep(8000);
  }

}
