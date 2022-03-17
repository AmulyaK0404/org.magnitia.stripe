package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationPage 
{
//define element locators
	@FindBy(xpath="//span[text()='Skip for now']/..") public WebElement skip;
	//constructor method
	public VerificationPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//operational and observation methods
	public void clickSkipForNow() throws Exception
	{
		try
		{
			skip.click();
			Thread.sleep(5000);
		}
		catch(Exception ex)
		{
			System.out.println("Verification page doesnt exist");
			
		}
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


