package Stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Pages.CustomerPages;
import Pages.HomePages;
import Pages.VerificationPages;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdef1 
{
	RemoteWebDriver driver;
	public HomePages obj1;
	public VerificationPages obj2;
	public CustomerPages obj3;
	
		@Given ("open {string} Browser")
		public void method1(String bn)
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		{
			
		obj1=new HomePages (driver);
		obj2=new VerificationPages(driver);
		obj3=new CustomerPages (driver);
		}
		
	@And ("launch site using {string}")
	public void method2(String url)
	{
		driver.get(url);
	}
	
	@When ("do login using {string} and {string} credentials")
	public void method(String uid, String pwd) throws Exception
	{
		obj1.Fillname(uid);
		obj1.Fillpassword(pwd);
		obj1.clickcontinue();
		obj2.clickskip();
	
	}
	
	@Then ("customer tab should be displayed")
	public void method3() throws Exception
	{
		obj3.clickcustomers();
	}
	
	 @When ("add cutomers")
	 public void method4(DataTable dt) throws Exception
	 {
		 List<Map<String,String>> l=dt.asMaps();
		 for(int i = 0; i<l.size(); i++)
		 {
			 
		 obj3.Clickaddcutomers();
		 obj3.Fillname(l.get(i).get("name"));
		 obj3.Fillemail(l.get(i).get("email"));
		 obj3.Filldiscription(l.get(i).get("description"));
		 obj3.Clickadd();
		 
		 } 
	 }
	 
	  @Then ("closed site")
	  public void method5()
	  {
		  driver.close();
	  }
	 
}