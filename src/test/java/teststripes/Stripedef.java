package teststripes;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.CustomersPage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.RecaptchaPage;
import pages.VerificationPage;

public class Stripedef
{
	//declare objects as to use in all step definition methods
	public RemoteWebDriver driver;
	public LoginPage obj1;
	public CustomersPage obj2;
	public LogoutPage obj3;
	public RecaptchaPage obj4;
	public VerificationPage obj5;
	
	//step definition methods
	@Given("open {string} browser")
	public void method1(String bn)
	{
		if(bn.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			//define objects
			driver=new ChromeDriver();
			obj1=new LoginPage(driver);
			obj2=new CustomersPage(driver);
			obj3=new LogoutPage(driver);
			obj4=new RecaptchaPage(driver);
			obj5=new VerificationPage(driver);
		}
	}
	
	@Given("launch site using {string}")
	public void method2(String url) throws Exception
	{
		driver.get(url);
		Thread.sleep(10000);
	}
	
	@When("do login using {string} and {string}")
	public void method3(String un,String pwd) throws Exception
	{
		obj1.fillUserName(un);
	obj1.fillPassword(pwd);
	obj1.clickContinue();
	obj4.clickIamNotRobot(driver);
	obj5.clickSkipForNow();
	}
	@Then("customers tab should be displayed")
	public void method4()
	{
		if(obj2.isCustomersDisplayed())
		{
			System.out.println("Customers link is displayed");
		}
		else
		{
			System.out.println("Customers link is not displayed");
			System.exit(0);
		}
	}
	
	@When("click on Customers")
	public void method_click() throws Exception
	{
		obj2.clickCustomers();
	}
	
	@When("add customers and verify")
	public void method5(DataTable dt) throws Exception
	{
		//take data from datatable
		List<Map<String,String>> l=dt.asMaps();
		for(int i=0;i<l.size();i++)
		{
			//click on Customers
			obj2.clickCustomers();
			//add customer
			obj2.clickAddCustomer();
			obj2.fillName(l.get(i).get("name"));
			obj2.fillEmail(l.get(i).get("email"));
			obj2.fillDescription(l.get(i).get("description"));
			obj2.clickAdd();
			if(obj2.isOutputMsgDisplayed())
			{
				System.out.println("Successful adding of a customer");
			}
			else
			{
				System.out.println("Unsuccessful adding of a customer");
				System.exit(0);
			}
	}
	
	}
	@When("do logout")
	public void method6() throws Exception
	{
		obj3.clickProfilePic();
		obj3.clickSignOut();
		Thread.sleep(35000);
		}
	@Then("login page should be redisplayed")
	public void method7()
	{
		if(obj3.isLoginRedisplayed())
		{
			System.out.println("Successful logout");
		}
		else
		{
			System.out.println("Unsuccessful logout");
			System.exit(0);
		}
	}
	@When("close site")
	public void method8()
	{
		driver.close();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


