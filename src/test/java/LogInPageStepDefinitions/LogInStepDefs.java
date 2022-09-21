package LogInPageStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import base.BaseClass;
import base.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LogInStepDefs extends BaseClass  {
		
	

  TestContext testcontext;
	
	public LogInStepDefs(TestContext testcontext) {
		this.testcontext = testcontext;
		
	}

	@Before
	public void initBrowser() throws Exception
	{
		System.out.println("Inside initBrowser");
		WebDriver driver = null;
		driver = launchBrowser();
			
		testcontext.setDriver(driver);
		
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.InitializePageObject(testcontext.getDriver());
		
	}
	
	@Given("User is on the LogIn Page")
	public void user_is_on_the_log_in_page() throws Exception {
				
        testcontext.getLoginObj().enterValidloginDetails();
	}

	@When("user clicks on login button with username and password")
	public void user_clicks_on_login_button_with_username_and_password() {
	
		testcontext.getLoginObj().clickonLogin();
	}

	@Then("should be able to log In as user")
	public void should_be_able_to_log_in_as_user() {
		
		String title = testcontext.loginObj.getLoginPageTitle();
		System.out.println("Title got loaded is " + title);
		Assert.assertEquals("LMS", title, "Title matched");
	   System.out.println("User is on Manage Program Page");
	}

	@After
	public void aftermethod() {
		System.out.println("executing after method");
		//testcontext.getDriver().quit();
       //	ExtentManager.endReport();
	}
}
