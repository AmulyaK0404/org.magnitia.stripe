package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CustomersPage 
{
//element locators
	@FindBy(xpath="//span[text()='Customers']/ancestor::a") public WebElement customers;
	@FindBy(xpath="//span[text()='Add customer']/ancestor::button") public WebElement addcustomer;
	@FindBy(xpath="//input[contains(@name,'name')]") public WebElement name;
	@FindBy(name="email") public WebElement email;
	@FindBy(name="description") public WebElement description;
	@FindBy(xpath="(//span[text()='Add customer']/ancestor::button)[2]") public WebElement add;
	@FindBy(xpath="//span[text()='Customer created']") public WebElement outputmsg;
	//constructor method
	public CustomersPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//operational and observation methods
	public boolean isCustomersDisplayed()
	{
		try
		{
			if(customers.isDisplayed())
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
		
		public void clickCustomers() throws Exception
		{
			customers.click();
			Thread.sleep(15000);
		}
	public void clickAddCustomer() throws Exception
	{
		addcustomer.click();
		Thread.sleep(10000);
	}
	public void fillName(String x) throws Exception
	{
		name.sendKeys(x);
		Thread.sleep(5000);
	}
	public void fillEmail(String x) throws Exception
	{
		email.sendKeys(x);
		Thread.sleep(5000);
	}
	public void fillDescription(String x) throws Exception
	
	{
		description.sendKeys(x);
		Thread.sleep(5000);
	}
	
	public void clickAdd() throws Exception
	{
		add.click();
		Thread.sleep(5000);
	}
	public boolean isOutputMsgDisplayed()
	{
		try
		{
			if(outputmsg.isDisplayed())
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
	
	


