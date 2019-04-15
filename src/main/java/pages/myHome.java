package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class myHome extends ProjectMethods {

	public myHome() {		
		PageFactory.initElements(driver,this);
	}	


	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement LeadsLink;
	public pages.myLeads myLeads()
	{
		click(LeadsLink);
		return new myLeads();
	}

}
