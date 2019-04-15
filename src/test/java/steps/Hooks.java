package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class Hooks extends ProjectMethods {
	
	@Before
	public void beforeScenario(Scenario sc)
	{
		startResult();
		startTestModule(sc.getName(), sc.getId());	
		test = startTestCase(sc.getId());
		test.assignCategory(category);
		test.assignAuthor(authors);
		startApp(browserName);	
	}
	
	@After
	public void afterScenario()
	{	
		closeAllBrowsers();
		endResult();

	}

}
