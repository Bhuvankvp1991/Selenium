package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {
	
	public ViewLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement TextValueFirstName;
	
	public ViewLead verifyFirstName(String data)
	{
		verifyExactText(TextValueFirstName,data);
		return this;
	}
	

}
