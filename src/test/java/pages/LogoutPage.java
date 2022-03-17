package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
@FindBy(xpath="//*[name()='svg' and @id='menu7-button']/*[name()='path']") public WebElement profilepic;
@FindBy(xpath="//span[text()='Sign out']/ancestor::button") public WebElement signout;
@FindBy(xpath="//span[text()='Sign out in to your account']") public WebElement relogin;
//constructor method
public LogoutPage(RemoteWebDriver driver)
{
	PageFactory.initElements(driver,this);
}

//operational and observation methods
public void clickProfilePic() throws Exception
{
	profilepic.click();
	Thread.sleep(15000);
}
public void clickSignOut() throws Exception
{
	signout.click();
	Thread.sleep(15000);
}
public boolean isLoginRedisplayed()
{
	try
	{
		if(relogin.isDisplayed())
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
catch(Exception ex)
	{
	return(false);
	}

}
}































