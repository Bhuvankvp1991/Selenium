package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class myLeads extends ProjectMethods {
	public myLeads() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement createLeadLink;
	public pages.CreateLead CreateLead()
	{
		click(createLeadLink);
		return new CreateLead();
	}
}
