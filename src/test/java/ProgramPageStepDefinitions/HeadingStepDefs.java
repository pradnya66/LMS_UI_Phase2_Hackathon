package ProgramPageStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HeadingStepDefs extends BaseClass {

	 TestContext testcontext;
		
		public HeadingStepDefs(TestContext testcontext) {
			this.testcontext = testcontext;
		}
	@Before
	public void initBrowser() throws Exception
	{
		System.out.println("Inside initBrowser");
		WebDriver driver = null;
		driver = launchBrowser();
				
		testcontext.setDriver(driver);
			
//		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.InitializePageObject(testcontext.getDriver());
			
	}		
	
	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
	}

	@When("User is on Program page")
	public void user_is_on_program_page() {
		testcontext.getProgramObj().clickOnProgrmBtn();
	}

	@Then("User should see a heading with text {string} on the page")
	public void user_should_see_a_heading_with_text_on_the_page(String expHeading) {
		 String actHeading = testcontext.getProgramObj().getHeading();
		 System.out.println("Expected:"+expHeading+"&  Actual:"+actHeading);
		 Assert.assertEquals(actHeading, expHeading);
	}
	
	@After
	public void aftermethod() {
		System.out.println("executing after method");
		testcontext.getDriver().quit();
       //	ExtentManager.endReport();
	}


}
