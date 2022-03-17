package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	
//define element locators
	@FindBy(name="email") public WebElement username;
	@FindBy(name="password") public WebElement password;
	@FindBy(xpath="//span[text()='Continue']/ancestor::button") public WebElement signin;
	//constructor method
	public LoginPage(RemoteWebDriver driver)
	{
		//connect driver object to above defined locators
		PageFactory.initElements(driver,this);
	}
	
	//operational and observation methods
	public void fillUserName(String x)
	{
		//before going to operate an element, driver object uses above locators to locate element called as lazy initialization
		username.sendKeys(x);
	}
	
	public void fillPassword(String x)
	{
	//locate elements and operate
	password.sendKeys(x);
}
public void clickContinue() throws Exception
{
	signin.click();
	Thread.sleep(15000);
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
