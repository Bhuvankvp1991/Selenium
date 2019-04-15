package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement companyNameValue;
	public CreateLead enterCompanyName(String data)
	{
		type(companyNameValue, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement FirstNameValue;
	public CreateLead enterFirstName(String data)
	{
		type(FirstNameValue,data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement LastNameValue;
	public CreateLead enterLastName(String data)
	{
		type(LastNameValue, data);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement submitButton;
	public ViewLead clickSubmitButton()
	{
		click(submitButton);
		return new ViewLead();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
