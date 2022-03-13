package linear;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StripeLinear {

	public static void main(String[] args) throws Exception
	{
		
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				driver.get("https://dashboard.stripe.com/login");
				Thread.sleep(5000);
				driver.findElement(By.name("email")).sendKeys("mayya.rosh1111@gmail.com");
				Thread.sleep(5000);
				driver.findElement(By.name("password")).sendKeys("abdulkalam123");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text() = 'Continue']/parent::span")).click();

	}

}
