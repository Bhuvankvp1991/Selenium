package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods {
	
@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Here we are creating the leads for LeafTaps";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC003";
	}

@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String cName,String fName,String lName,String vFirstName)
	{
	new LoginPage()
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLogIn()
	.clickCrmLink()
	.myLeads()
	.CreateLead()
	.enterCompanyName(cName)
	.enterFirstName(fName)
	.enterLastName(lName)
	
	.clickSubmitButton()
	.verifyFirstName(vFirstName);
	
	}

}
