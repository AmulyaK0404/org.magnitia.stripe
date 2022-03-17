package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecaptchaPage 
{
	//define element locators
	@FindBy(xpath="(//span[@role='checkbox']/div[1]") public WebElement notRobot;
	//constructor method
	public RecaptchaPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
//operational and observation methods
	public void clickIamNotRobot(RemoteWebDriver driver) throws Exception
	{
		try
		{
			WebElement e=driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
					driver.switchTo().frame(e);//goto frame level
		notRobot.click();
			Thread.sleep(5000);
			driver.switchTo().defaultContent();//back to page level
		}
	catch(Exception ex)
	{
		System.out.println("Recaptacha page doesnt exists");
	}
	}
}