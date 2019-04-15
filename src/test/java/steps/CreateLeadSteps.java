package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
	
ChromeDriver driver;
	
	//@Given("Invoke the browser")
	public void invokeApp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
	}

	//@And("Enter the UserName as (.*)")
	public void entertheUserName(String username)
	{
		driver.findElementById("username").sendKeys(username);
	}

	//@And("Enter the password as (.*)")
	public void enterthePassword(String password)
	{
		driver.findElementById("password").sendKeys(password);
	}
	
	//@When("click Login button")
	public void clickLoginButton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	public void clickOnCRMLInk()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	public void clickOnCreateLead()
	{
		
	}
}
