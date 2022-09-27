package homePageStepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.BaseClass;
import base.TestContext;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TitleStepDefs extends BaseClass{

	 TestContext testcontext;
		
		public TitleStepDefs(TestContext testcontext) {
			this.testcontext = testcontext;
		}
	
		@Before
		public void initBrowser() throws Exception
		{
			System.out.println("Inside initBrowser");
			WebDriver driver = null;
			driver = launchBrowser();
				
			testcontext.setDriver(driver);
			
//			testcontext.getDriver().get(prop.getProperty("baseUrl"));
			testcontext.InitializePageObject(testcontext.getDriver());
			
		}
		
		@Given("User is on the browser")
		public void user_is_on_the_browser() {
			testcontext.getDriver().get(prop.getProperty("baseUrl"));
			
			//testcontext.InitializePageObject(testcontext.getDriver());
			 System.out.println("After Given");
		}

		@When("User landed on the Home page after logging into the LMS website")
		public void user_landed_on_the_home_page_after_logging_into_the_lms_website() throws Exception {
			testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
			testcontext.getLoginObj().clickonLogin();
			 System.out.println("After When");
		}
	
		@Then("verify that title of the page is {string}")
		public void verify_that_title_of_the_page_is(String TitleExp) {
			
		  String TitleAct = testcontext.getHomeObj().getLoginPageTitle();
		  System.out.println("Actal title =" +TitleAct);
		  System.out.println("Expected title =" +TitleExp);
		  Assert.assertEquals(TitleAct, TitleExp);
		}
		
		
}
