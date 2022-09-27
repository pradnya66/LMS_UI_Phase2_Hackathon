package AssignmentPageStepDefinitions;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import base.BaseClass;
import base.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AssignmentHeadingStepDef extends BaseClass {

	TestContext testcontext;
	public AssignmentHeadingStepDef(TestContext testcontext) {
		this.testcontext = testcontext;
	}
	@Before
	public void initBrowser() throws Exception
	{
		System.out.println("Inside initBrowser");
		WebDriver driver = null;
		driver = launchBrowser();
			
		testcontext.setDriver(driver);
		testcontext.InitializePageObject(testcontext.getDriver());
	}
	
	@Given("User is logged on to LMS website -AssignmentPage")
	public void user_is_logged_on_to_lms_website_assignment_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
	   System.out.println("now user is on HomePage");
	}

	@When("User is on Manage Assignment page -AssignmentPage")
	public void user_is_on_manage_assignment_page_assignment_page() throws Exception {
		Thread.sleep(2000);
		testcontext.getHomeObj().clickonAssignmentTab();
	}

	@Then("User should see a heading with text {string} on the page -AssignmentPage")
	public void user_should_see_a_heading_with_text_on_the_page_assignment_page(String expHeading) {
	   String actHeading = testcontext.getAssignmentObj().getHeading();
	   System.out.println("Expected:"+expHeading+"&  Actual:"+actHeading);
	   Assert.assertEquals(actHeading, expHeading);
	}
	
	@Given("User is on Confirm Deletion form -AssignmentPage")
	public void user_is_on_confirm_deletion_form_assignment_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
	   System.out.println("now user is on HomePage");
	   testcontext.getHomeObj().clickonAssignmentTab();
	   testcontext.getAssignmentObj().clickDelete();
	}
 
	@Given("User is on Confirm Deletion form after selecting multiple options -AssignmentPage")
	public void user_is_on_confirm_deletion_form_after_selecting_multiple_options_assignment_page() throws Exception {
	   testcontext.getDriver().get(prop.getProperty("baseUrl"));
	   testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
	   testcontext.getLoginObj().clickonLogin();
	   testcontext.getHomeObj().clickonAssignmentTab();
	   testcontext.getAssignmentObj().selectCheckboxes(2);
	   testcontext.getAssignmentObj().clickTopDelete(); 
	}
	
	@Given("User is on AssignmentDetails Form -AssignmentPage")
	public void user_is_on_assignment_details_form_assignment_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
		testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
		testcontext.getLoginObj().clickonLogin();
		testcontext.getHomeObj().clickonAssignmentTab();
		testcontext.getAssignmentObj().clickNewAssign();
	}
	
	@Given("User is on AssignmentDetails Form after clicking edit-AssignmentPage")
	public void user_is_on_assignment_details_form_after_clicking_edit_assignment_page() throws Exception {
		testcontext.getDriver().get(prop.getProperty("baseUrl"));
	    testcontext.getLoginObj().shouldShowLMShomePageAfterLogin();
	    testcontext.getLoginObj().clickonLogin();
		testcontext.getHomeObj().clickonAssignmentTab();
		testcontext.getAssignmentObj().clickEdit();
	}
	
	@After
	public void teardown()
	{
		System.out.println("quiting the driver...");
		testcontext.getDriver().quit();
	}
}

